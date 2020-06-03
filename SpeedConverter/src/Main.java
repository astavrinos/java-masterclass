public class Main {

    static SpeedConverter speedConverter = new SpeedConverter();
    static MegaBytesConverter mbc = new MegaBytesConverter();
    static BarkingDog barkingDog = new BarkingDog();
    static LeapYear leapYear = new LeapYear();
    static DecimalComparator dc = new DecimalComparator();
    static EqualSumChecker esc = new EqualSumChecker();
    static TeenNumberChecker tnc = new TeenNumberChecker();
    static SecondsAndMinutesChallange smc = new SecondsAndMinutesChallange();
    static AreaCalculator ac = new AreaCalculator();
    static MinutesToYearsDaysCalculator mydc = new MinutesToYearsDaysCalculator();
    static IntEqualityPrinter iep = new IntEqualityPrinter();
    static PlayingCat playingCat = new PlayingCat();

    public static void main(String[] args) {

        // Exercise for speed Conversion
//        System.out.println(speedConverter.toMilesPerHour(1.5));
//        speedConverter.printConversion(95.75);

        // Exercise for kilobytes conversion to megabytes
//        mbc.printMegaBytesAndKiloBytes(2500);

        // Exercise for barkingDog
//        System.out.println(barkingDog.shouldWakeUp(true, 1));
//        System.out.println(barkingDog.shouldWakeUp(false, 2));
//        System.out.println(barkingDog.shouldWakeUp(true, 8));
//        System.out.println(barkingDog.shouldWakeUp(true, -1));

        // Exercise for leapYear
//        System.out.println(leapYear.isLeapYear(-1600));
//        System.out.println(leapYear.isLeapYear(1600));
//        System.out.println(leapYear.isLeapYear(2017));
//        System.out.println(leapYear.isLeapYear(2000));

        // Exercise for DecimalComparator
//        System.out.println(dc.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
//        System.out.println(dc.areEqualByThreeDecimalPlaces(3.175, 3.176));
//        System.out.println(dc.areEqualByThreeDecimalPlaces(3.0, 3.0));
//        System.out.println(dc.areEqualByThreeDecimalPlaces(-3.123, 3.123));

        // Exercise for EqualSumChecker
//        System.out.println(esc.hasEqualSum(1, 1, 1));
//        System.out.println(esc.hasEqualSum(1, 1, 2));
//        System.out.println(esc.hasEqualSum(1, -1, 0));

        // Exercise for TeenNumberChecker
//        System.out.println(tnc.hasTeen(9, 99, 19));
//        System.out.println(tnc.hasTeen(23, 15, 42));
//        System.out.println(tnc.hasTeen(22, 23, 34));
//        System.out.println(tnc.isTeen(9));
//        System.out.println(tnc.isTeen(13));

        // Exercise for SecondsAndMinutesChallange
//        System.out.println(smc.getDurationString(67, 0));
//        System.out.println(smc.getDurationString(3660));

        // Exercise for Area Calculator
//        System.out.println(ac.area(5.0));
//        System.out.println(ac.area(-1));
//        System.out.println(ac.area(5.0, 4.0));
//        System.out.println(ac.area(-1.0, 4.0));

        // Exercise minutesToYearsDayCalculator
//        mydc.printYearsAndDays(525600);
//        mydc.printYearsAndDays(1051200);
//        mydc.printYearsAndDays(561600);

        // Exercise for intEqualityPrinter
//        iep.printEqual(1, 1, 1);
//        iep.printEqual(1, 1, 2);
//        iep.printEqual(-1, -1, -1);
//        iep.printEqual(1, 2, 3);

        // Exercise for PlayingCat
        System.out.println(playingCat.isCatPlaying(true, 10));
        System.out.println(playingCat.isCatPlaying(false, 36));
        System.out.println(playingCat.isCatPlaying(true, 35));

    }
}
