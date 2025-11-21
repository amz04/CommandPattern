// File: TurnOnLightCommand.java
public class TurnOnLightCommand implements Command {
    private final Light light; // receiver

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
