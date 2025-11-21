// File: MacroCommand.java
import java.util.List;

public class MacroCommand implements Command {
    private final List<Command> commands; // list of commands to run

    public MacroCommand(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        // Executes all commands in order
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        // Undo in reverse order
        for (int i = commands.size() - 1; i >= 0; i--) {
            commands.get(i).undo();
        }
    }
}
