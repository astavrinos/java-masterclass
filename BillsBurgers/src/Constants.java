import java.util.HashMap;
import java.util.Map;

public class Constants {

    public static Map<String, Double> itemPrices = new HashMap<>();

    public final static String MUSHROOMS = "Mushrooms";
    public final static String TOMATOES = "Tomatoes";
    public final static String EGGS = "Eggs";
    public final static String CHILI = "Chili";
    public final static String LETTUCE = "Lettuce";
    public final static String AVOCADO = "Avocado";
    public final static String CHILIES = "Chilies";
    public final static String BACON = "Bacon";
    public final static String PICKLES = "Pickles";
    public final static String ONIONS = "Onions";
    public final static String CHEESE = "Cheese";
    public final static String CHIPS = "Chips";
    public final static String COCACOLA = "CocaCola";
    public final static String FANTA = "Fanta";
    public final static String SEVENUP = "SevenUp";

    public static void populateItemsMap() {
        itemPrices.put(MUSHROOMS, 0.70);
        itemPrices.put(TOMATOES, 0.50);
        itemPrices.put(EGGS, 1.50);
        itemPrices.put(CHILI, 0.60);
        itemPrices.put(LETTUCE, 0.50);
        itemPrices.put(AVOCADO, 1.00);
        itemPrices.put(CHILIES, 0.80);
        itemPrices.put(BACON, 2.00);
        itemPrices.put(PICKLES, 0.40);
        itemPrices.put(ONIONS, 0.50);
        itemPrices.put(CHEESE, 0.90);
        itemPrices.put(CHIPS, 2.00);
        itemPrices.put(COCACOLA, 1.00);
        itemPrices.put(FANTA, 1.00);
        itemPrices.put(SEVENUP, 1.00);
    }

}
