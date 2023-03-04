package chepter12.reflection;

public class ReflectionOneEmployee {

    public static void main(String[] args) {
       Class employeeClass = Employee.class;
        System.out.println(employeeClass.getClass());
    }
}
