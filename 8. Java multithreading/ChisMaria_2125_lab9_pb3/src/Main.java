public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        Printer printer = new Printer(fibonacci, 10);
        Producer producer = new Producer(fibonacci, 10);
        producer.start();
        printer.start();
    }
}

