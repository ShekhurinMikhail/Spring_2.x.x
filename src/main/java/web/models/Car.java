package web.models;

public class Car {
    private String automaker;
    private String model;
    private int maxSpeed;

    public Car() {
    }

    public Car(String automaker, String model, int maxSpeed) {
        this.automaker = automaker;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getAutomaker() {
        return automaker;
    }

    public void setAutomaker(String automaker) {
        this.automaker = automaker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
