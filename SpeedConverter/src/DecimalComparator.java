public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double valueOne, double valueTwo) {
        return (short) (valueOne * 1000) == (short) (valueTwo * 1000);
    }
}
