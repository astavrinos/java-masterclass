import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("How many numbers? ");
        int count = sc.nextInt();
        sc.nextLine();
        int[] numbers = readIntegers(count);
        int minimumValue = findMin(numbers);
        System.out.println("This is the min value of the numbers: " + minimumValue);
    }

    public static int[] readIntegers(int count) {
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Add numbers: ");
            numbers[i] = sc.nextInt();
            sc.nextLine();
        }
        sc.close();
        return numbers;
    }

    public static int findMin(int[] numbers) {

        int minValue = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (minValue > numbers[i]) {
                minValue = numbers[i];
            }
        }
        return minValue;
    }

}
