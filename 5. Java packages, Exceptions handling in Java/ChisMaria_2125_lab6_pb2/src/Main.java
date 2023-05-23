public class Main {
    public static void main(String[] args) {
        //ArithmeticException
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("An ArithmeticException occurred.");
        }
        try {
            int[] array = {1, 3, 4, 6};
            int b = array[-1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An ArrayIndexOutOfBoundsException occurred.");
        }
        try {
            String string = null;
            int length = string.length();
        } catch (NullPointerException e) {
            System.out.println("A NullPointerException occurred.");
        }
        try {
            String word = "word";
            int number = Integer.parseInt(word);
        } catch (NumberFormatException e) {
            System.out.println("A NumberFormatException occurred.");
        } finally {
            System.out.println("I may or may not have caught an exception");
        }
    }
}
