import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n = ");
        int n = sc.nextInt();
        Fraction[] fraction = new Fraction[n];
        for (int i = 0; i < n; i++) {
            fraction[i] = new Fraction();
            fraction[i].setA(sc.nextInt());
            fraction[i].setB(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            System.out.println(fraction[i] + " " + fraction[i].simplify());
        }
        int a, b;
        System.out.println("a = ");
        a = sc.nextInt();
        System.out.println("b = ");
        b = sc.nextInt();
        ExtendedFraction extendedFraction = new ExtendedFraction(a, b);
        System.out.println(extendedFraction.simplify());
        if (extendedFraction.superunitary(a, b) == true) {
            System.out.println("The fraction is superunitary.");
        } else
            System.out.println("The fraction is not superunitary.");
    }
}
