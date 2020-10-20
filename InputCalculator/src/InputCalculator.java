import java.util.ArrayList;
import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        ArrayList<Integer> temp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double avg = 0;

        while (sc.hasNextInt()) {
            temp.add(sc.nextInt());
        }

        sc.close();

        for (Integer integer : temp) {
            sum += integer;
        }

        if(!temp.isEmpty()) {
            avg = (double) sum / temp.size();
        }

        System.out.print("SUM = " + sum + " AVG = " + Math.round(avg));
    }

}
