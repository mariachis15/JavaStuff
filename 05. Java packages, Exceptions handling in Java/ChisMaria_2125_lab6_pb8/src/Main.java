import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = new String("MM15MCH");
        RegistrationNumber registrationNumber = new RegistrationNumber(number);
        registrationNumber.verifyNumber();

    }

}
