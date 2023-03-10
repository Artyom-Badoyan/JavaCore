package chepter12.reflectionEmployee;

import java.lang.reflect.Field;

public class ReflectionEmployeeExample1 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        EmployeeExample employeeExample = new EmployeeExample(10, "Artyom", "IT");
        Class employeeClass = employeeExample.getClass();
        Field field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true);
        double salaryValue = (Double) field.get(employeeExample);
        System.out.println(salaryValue);

        field.set(employeeExample, 1500);
        System.out.println(employeeExample);
    }
}
