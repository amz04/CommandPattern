// File: Command.java
public interface Command {
    // Executes the action
    void execute();
    // Reverses the action (for undo)
    void undo();
}
