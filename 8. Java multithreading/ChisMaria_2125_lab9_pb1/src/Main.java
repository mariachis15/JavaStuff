public class Main {
    public static void main(String[] args) {
        ObjectName obj1 = new ObjectName("Maria");
        ObjectName obj2 = new ObjectName("Eusebiu");
        ObjectName obj3 = new ObjectName("java");
        ObjectName obj4 = new ObjectName("inginerie software");
        ObjectName obj5 = new ObjectName("matematica");
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);
        Thread t4 = new Thread(obj4);
        Thread t5 = new Thread(obj5);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
