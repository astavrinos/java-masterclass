public class SpeedConverter {

    public static final double KPH = 1.609;
    public static final double MPH = 0.621;

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour * MPH);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + Math.round(kilometersPerHour / KPH) + " mi/h");
        }
    }

}
