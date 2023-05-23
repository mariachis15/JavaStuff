public class Number {
    private int number;
    private boolean available;

    public Number(int number) {
        available = true;
        this.number = number;
    }

    public synchronized void incDec() {
        if (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        number++;
        number--;
        available = true;
        notifyAll();
    }

    public int getNumber() {
        return number;
    }
}
