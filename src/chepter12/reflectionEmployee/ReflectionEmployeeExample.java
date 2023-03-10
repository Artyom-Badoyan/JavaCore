package chepter12.reflectionEmployee;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionEmployeeExample {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {

        Class employeeClass = Class.forName("chepter12.reflectionEmployee.EmployeeExample");

        Constructor<EmployeeExample> constructor = employeeClass.getConstructor();
        EmployeeExample obj = constructor.newInstance();

        Constructor constructor1 = employeeClass.getConstructor(int.class, String.class, String.class);
        Object obj1 = constructor1.newInstance(5, "Artyom", "IT");
        System.out.println(obj1);

        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(obj1, 800.88);
        System.out.println(obj1);
    }
}
