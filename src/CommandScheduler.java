// File: CommandScheduler.java
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CommandScheduler {

    private final SmartHomeInvoker invoker;
    private final ScheduledExecutorService executorService;

    public CommandScheduler(SmartHomeInvoker invoker) {
        this.invoker = invoker;
        this.executorService = Executors.newSingleThreadScheduledExecutor();
    }

    public void schedule(Command command, long delayMillis) {
        System.out.println("Scheduling command to run after " + delayMillis + " ms");
        executorService.schedule(
                () -> invoker.executeCommand(command),
                delayMillis,
                TimeUnit.MILLISECONDS
        );
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
