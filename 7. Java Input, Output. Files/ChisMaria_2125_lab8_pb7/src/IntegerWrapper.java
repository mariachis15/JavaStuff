import java.io.Serializable;
import java.util.List;

public class IntegerWrapper implements Serializable {
    private List<Integer> integers;

    public IntegerWrapper(List<Integer> integers) {
        this.integers = integers;
    }

    public List<Integer> getIntegers() {
        return integers;
    }

    public void setIntegers(List<Integer> integers) {
        this.integers = integers;
    }

    @Override
    public String toString() {
        return "IntegerWrapper{" +
                "integers=" + integers +
                '}';
    }
}
