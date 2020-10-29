import java.util.List;

public interface ISaveable {

    void read(List<String> savedValue);

    List<String> write();

}
