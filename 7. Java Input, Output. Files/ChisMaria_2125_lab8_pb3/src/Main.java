import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        DateTimeFormatter extendedDateFormatter = DateTimeFormatter.ofPattern("dd/MMMM/uuuu");
        String date = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            date = scanner.nextLine();
            if (date.equals("x") || date.equals("X")) {
                break;
            }
            LocalDate localDate = LocalDate.parse(date, dateFormatter);
            String expandedDate = localDate.format(extendedDateFormatter);
            System.out.println(expandedDate);
        }
    }
}
