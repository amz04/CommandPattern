// File: TurnOffACCommand.java
public class TurnOffACCommand implements Command {
    private final AirConditioner ac; // receiver

    public TurnOffACCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOff();
    }

    @Override
    public void undo() {
        ac.turnOn();
    }
}
