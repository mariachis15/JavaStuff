import java.util.Scanner;

public class Cmmdc {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n = scanner.nextInt();
        System.out.println("Enter the second number:");
        int m = scanner.nextInt();
        System.out.println("The greatest common divisor is: " + getCmmdc(n, m));
    }
    public static int getCmmdc(int n, int m) {
        int min = Integer.min(n, m);
        for (int i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                return i;
            }
        }
        return -1;
    }
}
