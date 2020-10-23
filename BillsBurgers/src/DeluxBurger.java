import java.util.List;

public class DeluxBurger extends Hamburger {

    public DeluxBurger(List<String> additions) {
        super(additions);
        setMeatType("Pulled pork");
        setBreadType("Corn bread");
        setAdditions(additions);
        setPrice(8.00);
    }

    @Override
    public void setAdditions(List<String> additions) {
        super.setAdditions(additions);
        additions.clear();
        additions.add(Constants.CHIPS);
        additions.add(Constants.COCACOLA);
    }
}
