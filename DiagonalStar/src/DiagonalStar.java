public class DiagonalStar {

//    public static void main(String[] var0) {
//        printSquareStar(2);
//    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            // row
            for (int i = 0; i < number; i++) {
                // column
                for (int j = 0; j < number; j++) {
                    if (i == 0 || j == 0 || i == j
                            || i == number - 1 || j == number - 1
                            || i + j == number - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                // New line
                System.out.println();
            }
        }
    }
}
