import java.util.ArrayList;

public class UserData implements ISaveable {

    ArrayList<Integer> storage;

    @Override
    public void setStorage(ArrayList<Integer> storage) {
        this.storage = storage;
    }

    @Override
    public ArrayList<Integer> getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        String value = "";
        for (Integer integer : storage) {
            value += ("The number is " + integer + "\n");
        }
        return value;
    }
}
