public class Vehicle {

    public int wheels;
    public String engine;
    public int seats;
    public String color;

    public Vehicle() {
        this.wheels = 0;
        this.engine = "";
        this.seats = 0;
        this.color = "";
    }

    public Vehicle(int wheels, String engine, int seats, String color) {
        this.wheels = wheels;
        this.engine = engine;
        this.seats = seats;
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
