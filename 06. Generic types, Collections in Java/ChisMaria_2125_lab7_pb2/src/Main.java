public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("The results for integers: ");
        int a = 5, b = 7;
        System.out.println("a + b = " + calculator.addition(a, b));
        System.out.println("a - b = " + calculator.subtraction(a, b));
        System.out.println("a * b = " + calculator.multiply(a, b));
        System.out.println("a / b = " + calculator.divide(a, b));
        System.out.println("The results for double: ");
        double c = 99.23, d = 21.11;
        System.out.println("c + d = " + calculator.addition(c, d));
        System.out.println("c - d = " + calculator.subtraction(c, d));
        System.out.println("c * d = " + calculator.multiply(c, d));
        System.out.println("c / d = " + calculator.divide(c, d));
        System.out.println("The results for strings: ");
        String str1 = "abcd";
        String str2 = "defg";
        System.out.println("string 1 + string 2 = " + calculator.addition(str1, str2));
        System.out.println("string 1 - string 2 = " + calculator.subtraction(str1, str2));
        System.out.println("string 1 * string 2 = " + calculator.multiply(str1, str2));


    }
}
