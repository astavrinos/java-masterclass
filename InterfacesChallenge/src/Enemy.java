import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Enemy implements ISaveable {

    private String name;
    private int health;
    private int hitPoints;

    public Enemy(String name, int health, int hitPoints) {
        this.name = name;
        this.health = health;
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    @Override
    public void read(List<String> savedValue) {
        if (Objects.nonNull(savedValue) && !savedValue.isEmpty()) {
            this.name = savedValue.get(0);
            this.health = Integer.parseInt(savedValue.get(1));
            this.hitPoints = Integer.parseInt(savedValue.get(2));
        }
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.health);
        values.add(2, "" + this.hitPoints);

        return values;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", hitPoints=" + hitPoints +
                '}';
    }
}
