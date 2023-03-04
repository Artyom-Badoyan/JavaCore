package chepter12.reflection;

public class ReflectionTwoEmployee {

    public static void main(String[] args) {
        Employee employee = new Employee();
        Class employeeClassExample = employee.getClass();
        System.out.println(employeeClassExample);
    }
}
