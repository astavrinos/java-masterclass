import java.util.ArrayList;
import java.util.List;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super(additionsForDeluxeBurger());
        setBreadType("Corn Bread");
        setBurgerName("Deluxe Burger");
        setMeatType("Pulled Pork");
        setPrice(6.0 + getItemPricesFromMap(additionsForDeluxeBurger()));
    }

    private static List<String> additionsForDeluxeBurger() {
        List<String> deluxeAdditions = new ArrayList<>();
        deluxeAdditions.add(Constants.COCACOLA);
        deluxeAdditions.add(Constants.CHIPS);
        return deluxeAdditions;
    }

}
