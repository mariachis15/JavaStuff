public class IncrementerDecrementer extends Thread {
    private Number number;

    public IncrementerDecrementer(Number number) {
        this.number = number;
    }

    public void run() {
        number.incDec();
    }

}
