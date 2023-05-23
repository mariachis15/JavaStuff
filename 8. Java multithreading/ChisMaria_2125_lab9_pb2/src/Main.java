public class Main {
    public static void main(String[] args) {
        NumbersContainer numbersContainer = new NumbersContainer();
        Generator generator = new Generator(numbersContainer);
        Calculator calculator = new Calculator(numbersContainer);
        generator.start();
        calculator.start();
    }
}
