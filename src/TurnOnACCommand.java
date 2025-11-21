// File: TurnOnACCommand.java
public class TurnOnACCommand implements Command {
    private final AirConditioner ac; // receiver

    public TurnOnACCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOn();
    }

    @Override
    public void undo() {
        ac.turnOff();
    }
}
