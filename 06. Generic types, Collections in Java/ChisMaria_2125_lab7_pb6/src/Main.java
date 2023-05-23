import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n = ");
        int n = sc.nextInt();
        sc.nextLine();
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Employee employee = new Employee();
            employee.setName(sc.nextLine());
            employee.setAge(sc.nextInt());
            employee.setSalary(sc.nextDouble());
            sc.nextLine();
            employees.add(employee);
        }
        System.out.println("the list sorted in ascending order by name: ");
        Collections.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("the list sorted in descending order by age using lambda expression: ");
        Collections.sort(employees, (a1, a2) -> a2.getAge() - a1.getAge());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("the list sorted in ascending order by name using Comparator interface: ");
        Collections.sort(employees, new CompareByName());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("the list sorted in descending order by salary using Comparator interface: ");
        Collections.sort(employees, new CompareBySalary());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
