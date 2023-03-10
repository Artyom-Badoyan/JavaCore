package chepter13.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        Employee employee = new Employee(3, "Artyom", "Badoyan", 1200);
        Employee employee1 = new Employee(2, "Poxos", "Poxosyan", 800);
        Employee employee2 = new Employee(1, "Karen", "Margaryan", 1000);
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        System.out.println("Наш список выглядит так \n" + list);

        Collections.sort(list, new IdComparator());
        System.out.println("Список отсортирован по ID \n" + list);

        Collections.sort(list, new NameComparator());
        System.out.println("Список отсортирован по name \n" + list);

        Collections.sort(list, new SalaryComparator());
        System.out.println("Список отсортирован по salary \n" + list);

    }
}
