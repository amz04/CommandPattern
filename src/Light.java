// Receiver class: contains the real logic for controlling the light
public class Light {
    private boolean isOn = false;

    // Turn the light ON
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Light is ON");
        } else {
            System.out.println("Light is already ON");
        }
    }

    // Turn the light OFF
    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Light is OFF");
        } else {
            System.out.println("Light is already OFF");
        }
    }
}
