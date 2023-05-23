import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of students = ");
        int n = sc.nextInt();
        sc.nextLine();
        SortedSet<Student> sortedStudents = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            Student student = new Student();
            student.setName(sc.nextLine());
            student.setGroup(sc.nextInt());
            student.setGrade(sc.nextFloat());
            sc.nextLine();
            sortedStudents.add(student);
        }
        for (Student student : sortedStudents) {
            System.out.println(student);
        }
    }
}
