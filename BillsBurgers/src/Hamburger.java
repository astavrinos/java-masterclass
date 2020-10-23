import java.util.List;

public class Hamburger {

    private String breadType;
    private String meatType;
    private List<String> additions;
    private double price;

    public Hamburger(List<String> additions) {
        this.breadType = "White bread";
        this.meatType = "Base meat";
        this.price = 3.0;
        additionalItemsValidation(additions);
    }

    public void additionalItemsValidation(List<String> additions) {
        if (additions.size() <= 4) {
            this.additions = additions;
            this.price = this.price + (additions.size() * 0.50);
        } else {
            System.out.println("Added more than 4 additional items");
            additions.clear();
        }
    }

    public void setAdditions(List<String> additions) {
        this.additions = additions;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public String toString() {
        return getClass().getSimpleName()
                + "\nBREAD TYPE: "
                + breadType
                + "\nMEAT TYPE: "
                + meatType
                + "\nADDITIONAL ITEMS: "
                + additions
                + "\nTOTAL PRICE: " + price + " euro";
    }

}
