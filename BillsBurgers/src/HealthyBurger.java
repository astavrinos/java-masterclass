import java.util.List;

public class HealthyBurger extends Hamburger {

    private List<String> additions;
    private double price;

    public HealthyBurger(List<String> additions) {
        super(additions);
        setMeatType("Vegan meat");
        setBreadType("Brown bread");
        additionalItemsValidation(additions);
        setAdditions(this.additions);
        setPrice(4.00 + this.price);
    }

    @Override
    public void additionalItemsValidation(List<String> additions) {
        if (additions.size() <= 6) {
            this.additions = additions;
            this.price = this.price + (additions.size() * 0.50);
        } else {
            System.out.println("Added more than 6 additional items");
            additions.clear();
        }
    }

}
