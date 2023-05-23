import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class VirtualLibrary<T> {
    private SortedSet<T> stock;

    public VirtualLibrary() {
        stock = new TreeSet<>();
    }

    public void addItem(T item) {
        stock.add(item);
    }

    public SortedSet<T> getStock() {
        return stock;
    }

    public void addItems(List<T> items) {
        stock.addAll(items);
    }

    public T getItem(int i) {
        int counter = 0;
        for (T item : stock) {
            if (counter == i) {
                return item;
            }
            counter++;
        }
        return null;
    }

    public boolean verifyItem(T object) {
        for (T item : stock) {
            if (object.equals(item)) {
                return true;
            }
        }
        return false;
    }
}
