import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] groups = new String[]{"2125", "2126", "2127"};
        List<InputStream> streams = new ArrayList<>();
        for (int i = 0; i < groups.length; i++) {
            String fileName = "An_2023_Grupa_" + groups[i] + ".txt";
            InputStream inputStream = new FileInputStream(fileName);
            streams.add(inputStream);
        }
        Enumeration<InputStream> enumeration = Collections.enumeration(streams);
        SequenceInputStream ss = new SequenceInputStream(enumeration);
        String student;
        List<String> students = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(ss));
        while ((student = reader.readLine()) != null) {
            students.add(student);
        }
        Collections.sort(students);
        PrintWriter writer = new PrintWriter("sortedStudents.txt");
        for (String student1 : students) {
            writer.println(student1);
        }
        writer.close();
    }
}
