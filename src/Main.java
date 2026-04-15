// File: SmartHomeController.java
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Receivers
        Light light = null;
        AirConditioner ac = new AirConditioner();
        DoorLock doorLock = new DoorLock();
        MusicPlayer musicPlayer = new MusicPlayer();

        // Commands
        Command lightOn      = new TurnOnLightCommand(light);
        Command lightOff     = new TurnOffLightCommand(light);
        Command acOn         = new TurnOnACCommand(ac);
        Command acOff        = new TurnOffACCommand(ac);
        Command lockDoor     = new LockDoorCommand(doorLock);
        Command unlockDoor   = new UnlockDoorCommand(doorLock);
        Command playMusic    = new PlayMusicCommand(musicPlayer);
        Command stopMusic    = new StopMusicCommand(musicPlayer);

        // Invoker
        SmartHomeInvoker invoker = new SmartHomeInvoker();

        // Optional scheduler
        CommandScheduler scheduler = new CommandScheduler(invoker);

        System.out.println("=== Single commands ===");
        invoker.executeCommand(lightOn);
        invoker.executeCommand(acOn);
        invoker.executeCommand(unlockDoor);
        invoker.executeCommand(playMusic);

        System.out.println("\n=== Undo last 3 actions ===");
        invoker.undo();
        invoker.undo();
        invoker.undo();

        System.out.println("\n=== Redo last 2 actions ===");
        invoker.redo();
        invoker.redo();

        System.out.println("\n=== Macro command: Morning Routine ===");
        Command morningRoutine = new MacroCommand(
                Arrays.asList(lightOn, acOn, unlockDoor, playMusic)
        );
        invoker.executeCommand(morningRoutine);

        System.out.println("\n=== Undo Morning Routine ===");
        invoker.undo(); // this undoes the macro, which undoes all commands inside

        System.out.println("\n=== Scheduling Night Routine after 2 seconds ===");
        Command nightRoutine = new MacroCommand(
                Arrays.asList(lightOff, acOff, lockDoor, stopMusic)
        );
        scheduler.schedule(nightRoutine, 2000);

        // Give some time for the scheduler to run before shutting down
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        scheduler.shutdown();
        System.out.println("\n=== Smart Home demo finished ===");
    }
}
