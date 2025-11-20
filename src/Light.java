// File: Light.java
public class Light {
    private boolean isOn = false;

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Light is ON");
        } else {
            System.out.println("Light is already ON");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Light is OFF");
        } else {
            System.out.println("Light is already OFF");
        }
    }
}
