import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player adamos = new Player("Chillzman", 10, 15);
        System.out.println(adamos.toString());
        saveObject(adamos);

        adamos.setHealth(10);
        System.out.println(adamos);
        adamos.setWeapon("M16");
        saveObject(adamos);
//        loadObject(adamos);
        System.out.println(adamos);

        ISaveable enemy = new Enemy("Warlock", 100, 120);
        System.out.println(((Enemy) enemy).getHitPoints());
        System.out.println(enemy);
        saveObject(enemy);
    }

    public static List<String> readValues() {
        List<String> values = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter values\n" +
                "0 to quit");

        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter values: ");
                    String userInput = sc.nextLine();
                    sc.nextLine();
                    values.add(index, userInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        objectToSave.write().forEach(values ->
                System.out.println("Saving " + values + " to storage device"));
    }

    public static void loadObject(ISaveable objectToLoad) {
        List<String> values = readValues();
        objectToLoad.read(values);
    }

}
