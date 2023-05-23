import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        KeyValidator keyValidator = new KeyValidator();
        if (keyValidator.verifyGroup(str) == false || keyValidator.checkValidLettersAndDigits(str) == false) {
            System.out.println("Cheie de autentificare incorectă!");
        } else {
            System.out.println("Cheie de autentificare corecta");
        }

    }
}
