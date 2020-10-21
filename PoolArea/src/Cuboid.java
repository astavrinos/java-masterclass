public class Cuboid extends Rectangle {

    private double height = 0.0;

    public Cuboid(double width, double length, double height) {
        super(width, length);

        if (height < 0) {
            this.height = 0.0;
        } else {
            this.height = height;
        }
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    public double getHeight() {
        return height;
    }

}
