import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nr = 0;
        Scanner sc = new Scanner(System.in);
        while (nr < 10) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            CmmdcCalculator calculator = new CmmdcCalculator(a, b);
            calculator.start();
        }
    }
}
