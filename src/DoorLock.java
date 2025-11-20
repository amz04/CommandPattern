// File: DoorLock.java
public class DoorLock {
    private boolean isLocked = true; // assume locked by default

    public void lock() {
        if (!isLocked) {
            isLocked = true;
            System.out.println("Door is Locked");
        } else {
            System.out.println("Door is already Locked");
        }
    }

    public void unlock() {
        if (isLocked) {
            isLocked = false;
            System.out.println("Door is Unlocked");
        } else {
            System.out.println("Door is already Unlocked");
        }
    }
}
