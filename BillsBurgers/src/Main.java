import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> additions = new ArrayList<>();
        additions.add(Constants.TOMATOES);
        additions.add(Constants.BACON);
        additions.add(Constants.PICKLES);
        additions.add(Constants.LETTUCE);
        Hamburger base = new Hamburger(additions);
        System.out.println(base.toString());

        List<String> additionsHealthy = new ArrayList<>();
        additionsHealthy.add(Constants.TOMATOES);
        additionsHealthy.add(Constants.LETTUCE);
        additionsHealthy.add(Constants.PICKLES);
        additionsHealthy.add(Constants.MUSHROOMS);
        additionsHealthy.add(Constants.CHILIES);
        additionsHealthy.add(Constants.AVOCADO);
        HealthyBurger healthyBurger = new HealthyBurger(additionsHealthy);
        System.out.println(healthyBurger.toString());

        List<String> additionsDeluxBurger = new ArrayList<>();
        additionsDeluxBurger.add(Constants.TOMATOES);
        additionsDeluxBurger.add(Constants.LETTUCE);
        additionsDeluxBurger.add(Constants.PICKLES);
        additionsDeluxBurger.add(Constants.MUSHROOMS);
        additionsDeluxBurger.add(Constants.CHILIES);
        additionsDeluxBurger.add(Constants.AVOCADO);
        DeluxBurger deluxBurger = new DeluxBurger(additionsDeluxBurger);
        System.out.println(deluxBurger.toString());

    }

}
