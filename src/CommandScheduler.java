// File: CommandScheduler.java
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CommandScheduler {

    private final SmartHomeInvoker invoker; // uses the invoker to run commands
    private final ScheduledExecutorService executorService; // handles timed execution

    public CommandScheduler(SmartHomeInvoker invoker) {
        this.invoker = invoker;
        this.executorService = Executors.newSingleThreadScheduledExecutor();
    }

    // Schedules a command to run after delayMillis milliseconds
    public void schedule(Command command, long delayMillis) {
        System.out.println("Scheduling command to run after " + delayMillis + " ms");
        executorService.schedule(
                () -> invoker.executeCommand(command),
                delayMillis,
                TimeUnit.MILLISECONDS
        );
    }

    // Shuts down scheduler threads
    public void shutdown() {
        executorService.shutdown();
    }
}
