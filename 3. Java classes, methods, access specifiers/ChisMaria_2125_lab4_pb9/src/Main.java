import java.util.Scanner;

public class Main {
    public static Student createStudent(String str) {
        String[] parts = str.split("\\^\\^\\^");
        String name = parts[0];
        String phoneNumber = parts[1];
        if (phoneNumber.length() != 10) {
            return null;
        }
        float average = Float.parseFloat(parts[2]);
        Student student = new Student(name, phoneNumber, average);
        return student;
    }

    public static Student[] sortStudentsByName(Student[] students) {
        Student aux;
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getName().compareTo(students[j].getName()) > 0) {
                    aux = students[i];
                    students[i] = students[j];
                    students[j] = aux;
                }
            }
        }
        return students;
    }

    public static Student[] sortStudentsByAverage(Student[] students) {
        Student aux;
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getAverage() > students[j].getAverage()) {
                    aux = students[i];
                    students[i] = students[j];
                    students[j] = aux;
                }
            }
        }
        return students;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            while (createStudent(str) == null) {
                System.out.println("Reintroduceti datele folosind un numar de telefon valid.");
                str = sc.nextLine();
            }
            students[i] = createStudent(str);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(students[i]);
        }
        Student[] sortedStudents = sortStudentsByAverage(students);
        for (int i = 0; i < n; i++) {
            System.out.println(students[i]);
        }
    }
}
