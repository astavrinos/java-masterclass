import java.util.ArrayList;

public class Sum3And5Challange {

    public static void main(String[] args) {
        ArrayList<Integer> savedNumbers = new ArrayList<>();

        int sum = 0;
        for (int i = 1; i <= 1000; i++) {

            if (savedNumbers.size() == 5) {
                break;
            }

            if ((i % 3 == 0) && (i % 5 == 0)) {
                savedNumbers.add(i);
            }
        }

        for(int i = 0; i < savedNumbers.size(); i++) {
            sum += savedNumbers.get(i);
        }

        System.out.println(sum);

    }

}
