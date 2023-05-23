public class Main {
    public static void main(String[] args) {
        try {
            new ColoredCircle();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
