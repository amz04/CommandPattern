// File: LockDoorCommand.java
public class LockDoorCommand implements Command {
    private final DoorLock doorLock; // reciever

    public LockDoorCommand(DoorLock doorLock) {
        this.doorLock = doorLock;
    }

    @Override
    public void execute() {
        doorLock.lock();
    }

    @Override
    public void undo() {
        doorLock.unlock();
    }
}
