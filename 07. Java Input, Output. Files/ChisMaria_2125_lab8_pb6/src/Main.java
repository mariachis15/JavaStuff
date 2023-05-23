import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("Persons.csv"));
        sc.useDelimiter("/");
        String[] fields = new String[10000];
        int index = 0;
        while (sc.hasNext()) {
            fields[index++] = sc.next();
        }
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < index; i += 5) {
            Person person = new Person(fields[i], fields[i + 1], fields[i + 2], fields[i + 3], fields[i + 4]);
            persons.add(person);
        }
        sc.close();
        FileWriter fileWriter1 = new FileWriter("decembers.txt", true);
        FileWriter fileWriter2 = new FileWriter("andreiNicolae.txt", true);
        BufferedWriter bufferedWriter1 = new BufferedWriter(fileWriter1);
        BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter2);
        for (Person person : persons) {
            if (person.getDateOfBirth().contains("dec")) {
                bufferedWriter1.append(person.toString());
                bufferedWriter1.append("\n");
            }
            if (person.getFirstName().equals("Nicolae") || person.getFirstName().equals("Andrei")) {
                bufferedWriter2.append(person.toString());
                bufferedWriter2.append("\n");
            }
        }
        bufferedWriter1.close();
        bufferedWriter2.close();
    }
}
