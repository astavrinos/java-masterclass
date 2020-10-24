import java.util.List;

public class HealthyBurger extends Hamburger {

    public HealthyBurger(List<String> additions) {
        super(additions);
        setBurgerName("Healthy Burger");
        setBreadType("Brown Bread");
        setMeatType("Vegan Meat");
        setPrice(4.0);
        additionalItemsValidation(additions);
    }

    @Override
    public void additionalItemsValidation(List<String> additions) {
        if (additions.size() <= 6) {
            double itemPrices = getItemPricesFromMap(additions);
            setPrice(getPrice() + itemPrices);
        } else {
            System.out.println("Added more than 6 additional items");
            additions.clear();
        }
    }

}
