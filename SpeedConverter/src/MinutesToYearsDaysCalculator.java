public class MinutesToYearsDaysCalculator {

    public static final int DAYS_OF_THE_YEAR = 365;
    public static final int ONE_DAY_TO_HOURS = 24;
    public static final int ONE_HOUR_TO_MINUTES = 60;

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            // 1 hour = 60 minutes
            // 1 day = 24 hours
            // 1 year = 365 days
            long hours = minutes / ONE_HOUR_TO_MINUTES;
            long days = (hours / ONE_DAY_TO_HOURS) % DAYS_OF_THE_YEAR;
            long years = minutes / (ONE_HOUR_TO_MINUTES * ONE_DAY_TO_HOURS * DAYS_OF_THE_YEAR);

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }

}
