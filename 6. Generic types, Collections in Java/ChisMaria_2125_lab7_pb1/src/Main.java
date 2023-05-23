public class Main {
    public static void main(String[] args) {
        int value1 = 2;
        IntegerVariable integerVariable = new IntegerVariable();
        System.out.println("The next integer value is: " + integerVariable.next(value1));
        double value2 = 2.4;
        DoubleVariable doubleVariable = new DoubleVariable();
        System.out.println("The next double value is: " + doubleVariable.next(value2));
        char value3 = 'm';
        CharacterVariable characterVariable = new CharacterVariable();
        System.out.println("The next character is: " + characterVariable.next(value3));
    }

}
