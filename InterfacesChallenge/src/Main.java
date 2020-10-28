import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UserData userData = new UserData();
        ArrayList<Integer> data = readValues();
        userData.setStorage(data);
        System.out.println(userData.toString());
    }

    public static ArrayList<Integer> readValues() {
        ArrayList<Integer> values = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a number\n" +
                "0 to quit");

        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a number: ");
                    int userInput = sc.nextInt();
                    values.add(index, userInput);
                    index++;
                    break;
            }
        }
        return values;
    }

}
