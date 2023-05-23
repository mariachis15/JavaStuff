public class ObjectName implements Runnable {
    private String name;
    private static int counter;

    public ObjectName(String name) {
        this.name = name;
        counter++;
    }

    @Override
    public void run() {
        for (int i = 0; i < counter; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name);
        }
    }
}
