// File: AirConditioner.java
public class AirConditioner {
    private boolean isOn = false;

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("AC is ON");
        } else {
            System.out.println("AC is already ON");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("AC is OFF");
        } else {
            System.out.println("AC is already OFF");
        }
    }
}
