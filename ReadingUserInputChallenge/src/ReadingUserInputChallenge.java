import java.util.ArrayList;
import java.util.Scanner;

public class ReadingUserInputChallenge {

    private static ArrayList<Integer> numberList = new ArrayList<>();
    private static Scanner scanner;

    public static void main(String[] args) {

        userInputNumbers();
        calculateTheSumOfNumbers();
    }

    private static void calculateTheSumOfNumbers() {
        int sum = 0;

        for (int i = 0; i < numberList.size(); i++) {
            sum = sum + numberList.get(i);
        }

        System.out.println(sum);
    }

    private static void userInputNumbers() {
        scanner = new Scanner(System.in);
        while (numberList.size() < 10) {
            System.out.println("(" + numberList.size() + "/10) - " + "Please enter a number: ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                scanner.nextLine();
                numberList.add(number);
            } else {
                System.out.println("Invalid Number");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

}
