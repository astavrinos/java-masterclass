import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

public class Hamburger {

    private String breadType;
    private String meatType;
    private String burgerName;
    private List<String> additions;
    private double price;

    public Hamburger(List<String> additions) {
        this.burgerName = "Basic";
        this.breadType = "White Bread";
        this.price = 3.0;
        this.meatType = "Basic meat";
        this.additions = additions;
        additionalItemsValidation(additions);
    }

    public void additionalItemsValidation(List<String> additions) {
        if (additions.size() <= 4) {
            this.additions = additions;
            double itemPrices = getItemPricesFromMap(additions);
            this.price = this.price + itemPrices;
        } else {
            System.out.println("Added more than 4 additional items");
            additions.clear();
        }
    }

    double getItemPricesFromMap(List<String> additions) {
        double additionalPriceResult = 0.0;
        for (String addition : additions) {
            additionalPriceResult += Constants.itemPrices.get(addition);
        }
        return additionalPriceResult;
    }

    public String toString() {
        NumberFormat formatter = new DecimalFormat("#0.00");

        return burgerName
                + "\nBREAD TYPE: "
                + breadType
                + "\nMEAT TYPE: "
                + meatType
                + "\nADDITIONAL ITEMS: "
                + additions
                + "\nTOTAL PRICE: " + formatter.format(price) + " euro";
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
