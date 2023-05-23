import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Class2 class2 = new Class2(num1, num2);
        System.out.println(class2.sum(num1, num2));
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();
        System.out.println(class2.product(num3, num4));

    }

}
