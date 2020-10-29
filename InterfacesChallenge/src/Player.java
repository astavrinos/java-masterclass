import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Player implements ISaveable {

    private String username;
    private int health;
    private int hitPoints;
    private String weapon;

    public Player(String username, int health, int hitPoints) {
        this.username = username;
        this.health = health;
        this.hitPoints = hitPoints;
        this.weapon = "Sword";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void read(List<String> savedValue) {
        if (Objects.nonNull(savedValue) && !savedValue.isEmpty()) {
            this.username = savedValue.get(0);
            this.health = Integer.parseInt(savedValue.get(1));
            this.hitPoints = Integer.parseInt(savedValue.get(2));
            this.weapon = savedValue.get(3);
        }
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.username);
        values.add(1, "" + this.health);
        values.add(2, "" + this.hitPoints);
        values.add(3, this.weapon);

        return values;
    }

    @Override
    public String toString() {
        return "Player{" +
                "username='" + username + '\'' +
                ", health=" + health +
                ", hitPoints=" + hitPoints +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
