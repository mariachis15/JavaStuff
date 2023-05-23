import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumbersContainer {
    private List<Integer> randomNumbers;
    private Random r;
    private boolean available;

    public NumbersContainer() {
        randomNumbers = new ArrayList<>();
        r = new Random();
    }

    public synchronized void addNewRandomNumber() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        randomNumbers.add(r.nextInt(31));
        available = false;
        notifyAll();
    }

    public synchronized void showCircleSurface() {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (randomNumbers.size() > 0) {
            List<Integer> visited = new ArrayList<>();
            for (Integer i : randomNumbers) {
                visited.add(i);
                if (i % 3 == 0) {
                    System.out.println("surface for R = " + i + " : " + Math.PI * i * i);
                    break;
                }
            }
            randomNumbers.removeAll(visited);
        }
        available = true;
        notifyAll();
    }
}
