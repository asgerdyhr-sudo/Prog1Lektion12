package opgave03;

public class Fan {
    private final int slow = 1;
    private final int medium = 2;
    private final int fast = 3;
    private int speed = slow;
    private boolean fanIsOn = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
        speed = medium;
        fanIsOn = true;
    }

    @Override
    public String toString() {
        if (fanIsOn) {
            return "Fan speed: " + speed + ", color: " + color + ", radius: " + radius;
        } else {
            return "Fan color: " + color + ", radius: " + radius + ", fan is off";
        }
    }

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isFanIsOn() {
        return fanIsOn;
    }

    public void setFanIsOn(boolean fanIsOn) {
        this.fanIsOn = fanIsOn;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
