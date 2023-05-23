public class Main {
    public static void main(String[] args) {
        Number number = new Number(23);
        IncrementerDecrementer i1 = new IncrementerDecrementer(number);
        IncrementerDecrementer i2 = new IncrementerDecrementer(number);
        IncrementerDecrementer i3 = new IncrementerDecrementer(number);
        IncrementerDecrementer i4 = new IncrementerDecrementer(number);
        IncrementerDecrementer i5 = new IncrementerDecrementer(number);
        i1.start();
        i2.start();
        i3.start();
        i4.start();
        i5.start();
        System.out.println(number.getNumber());
    }
}
