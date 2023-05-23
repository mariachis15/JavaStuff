import java.util.Comparator;

public class CompareBySalary implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        if (employee2.getSalary() == employee1.getSalary()) {
            return 0;
        } else if (employee2.getSalary() > employee1.getSalary()) {
            return 1;
        }
        return -1;
    }
}
