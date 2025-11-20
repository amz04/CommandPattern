// File: SmartHomeInvoker.java
import java.util.Stack;

public class SmartHomeInvoker {

    private final Stack<Command> undoStack = new Stack<>();
    private final Stack<Command> redoStack = new Stack<>();

    // Execute a command and store it for undo
    public void executeCommand(Command command) {
        command.execute();
        undoStack.push(command);
        redoStack.clear(); // once a new command is executed, redo is not valid
    }

    // Undo last command
    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo.");
            return;
        }

        Command command = undoStack.pop();
        command.undo();
        redoStack.push(command);
    }

    // Redo last undone command
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo.");
            return;
        }

        Command command = redoStack.pop();
        command.execute();
        undoStack.push(command);
    }
}
