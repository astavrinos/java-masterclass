public class Car extends Vehicle {

    public int windows;
    public int speakers;
    public boolean cabriolet;

    public Car() {
        this.windows = 0;
        this.speakers = 0;
        this.cabriolet = false;
    }

    public Car(int wheels, String engine, int seats, String color, int windows, int speakers, boolean cabriolet) {
        super(wheels, engine, seats, color);
        this.windows = windows;
        this.speakers = speakers;
        this.cabriolet = cabriolet;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getSpeakers() {
        return speakers;
    }

    public void setSpeakers(int speakers) {
        this.speakers = speakers;
    }

    public boolean isCabriolet() {
        return cabriolet;
    }

    public void setCabriolet(boolean cabriolet) {
        this.cabriolet = cabriolet;
    }

}
