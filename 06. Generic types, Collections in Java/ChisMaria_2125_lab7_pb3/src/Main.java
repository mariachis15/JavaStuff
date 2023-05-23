import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Child> children = new ArrayList<>();
        System.out.println("Enter the kids: ");
        for (int i = 0; i < 2; i++) {
            String name = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
            Child child = new Child();
            child.setAttribute(age, name);
            children.add(child);
        }

        System.out.println("Enter the adults: ");
        List<Adult> adults = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            String name = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
            Adult adult = new Adult();
            adult.setAttribute(age, name);
            adults.add(adult);
        }
        System.out.println("Enter the retirees: ");
        List<Retired> retirees = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            String name = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
            Retired retired = new Retired();
            retired.setAttribute(age, name);
            retirees.add(retired);
        }
        System.out.println("The people you entered are: ");
        for (Child child : children) {
            System.out.println(child.getAttribute());
        }
        for (Adult adult : adults) {
            System.out.println(adult.getAttribute());
        }
        for (Retired retired : retirees) {
            System.out.println(retired.getAttribute());
        }
    }
}
