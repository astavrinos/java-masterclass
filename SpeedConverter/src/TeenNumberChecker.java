public class TeenNumberChecker {

    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree) {
        if(ageOne >= 13 && ageOne <= 19) {
            return true;
        }

        if(ageTwo >= 13 && ageTwo <= 19) {
            return true;
        }

        return ageThree >= 13 && ageThree <= 19;
    }

    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }

}
