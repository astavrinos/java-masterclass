import java.util.Scanner;

public class Main {

    private static int[] numbers = new int[5];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        getIntegers();
        printArrays();
        sortIntegers();
        printArrays();
    }

    private static void printArrays() {
        for (int number : numbers) {
            System.out.print(number + ", ");
        }
        System.out.println();
    }

    private static void getIntegers() {
        int i = 0;
        while (i < numbers.length) {
            System.out.println("Add numbers: ");
            numbers[i] = sc.nextInt();
            i++;
        }
        sc.close();
    }

    private static void sortIntegers() {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    flag = true;
                }
            }
        }

    }

}
