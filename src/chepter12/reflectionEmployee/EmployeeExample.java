package chepter12.reflectionEmployee;

public class EmployeeExample {

    public int id;
    public String name;
    public String department;
    private double salary = 1000;

    public EmployeeExample() {
    }

    public EmployeeExample(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

//    public EmployeeExample(int id, String name, String department, double salary) {
//        this.id = id;
//        this.name = name;
//        this.department = department;
//        this.salary = salary;
//    }

//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }

    private void changeDepartment(String newDepartment) {
        department = newDepartment;
        System.out.println("New department is: " + department);
    }

    public void increaseSalary() {
        salary *= 2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
