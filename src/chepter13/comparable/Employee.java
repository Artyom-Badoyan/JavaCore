package chepter13.comparable;

public class Employee implements Comparable<Employee> {

    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        if (this.id == employee.id) {
            return 0;
        } else if (this.id < employee.id) {
            return -1;
        } else {
            return 1;
        }
    }
}
