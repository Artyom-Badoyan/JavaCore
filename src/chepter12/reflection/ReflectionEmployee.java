package chepter12.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionEmployee {

    public static void main(String[] args) {
        try {
            Class employee = Class.forName("chepter12.reflection.Employee");
            getId(employee);
            getFilds(employee);
            getDeclaredFields(employee.getDeclaredFields());
            method(employee);
            Method someMethod = getMethod(employee);
            returnMethods(employee, someMethod);
            getDeclaredMethods(employee);
            publicMethods(employee);
            constructorInfo(employee);
            constructorInfo2(employee);
            constructorInfo3(employee);
        } catch (ClassNotFoundException e) {
            System.out.println("Please write the correct path:");
        } catch (NoSuchFieldException e) {
            System.out.println("Please write the correct field name:");
        } catch (NoSuchMethodException e) {
            System.out.println("Please write correct name method:");
        }
    }

    private static void constructorInfo3(Class employee) {
        System.out.println();
        Constructor[] constructors = employee.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("Constructor " + constructor.getName() +
                    " has " + constructor.getParameterCount() +
                    " parameters, their types are: " +
                    Arrays.toString(constructor.getParameterTypes()));
        }
    }

    private static void constructorInfo2(Class employee) throws NoSuchMethodException {
        System.out.println();
        Constructor constructor2 = employee.getConstructor(int.class, String.class, String.class);
        System.out.println("Constructor has " + constructor2.getParameterCount() +
                " parameters, their types are: " +
                Arrays.toString(constructor2.getParameterTypes()));
    }

    private static void constructorInfo(Class employee) throws NoSuchMethodException {
        System.out.println();
        System.out.println("Working with constructor:");
        Constructor constructor = employee.getConstructor();
        System.out.println("Constructor has " + constructor.getParameterCount() +
                " parameters, their types are: " +
                Arrays.toString(constructor.getParameterTypes()));
    }

    private static void publicMethods(Class employee) {
        System.out.println();
        Method[] publicMethods = employee.getDeclaredMethods();
        for (Method method : publicMethods) {
            if (Modifier.isPublic(method.getModifiers()))
                System.out.println("Name of methods = " + method.getName() +
                        ", return type = " + method.getReturnType() +
                        ", parameter types = " +
                        Arrays.toString(method.getParameterTypes()));
        }
    }

    private static void getDeclaredMethods(Class employee) {
        System.out.println();
        Method[] allMethods = employee.getDeclaredMethods();
        for (Method allMethod : allMethods) {
            System.out.println("Name of methods = " + allMethod.getName() +
                    ", return type = " + allMethod.getReturnType() +
                    ", parameter types = " +
                    Arrays.toString(allMethod.getParameterTypes()));
        }
    }

    private static void getId(Class employee) throws NoSuchFieldException {
        Field id = employee.getField("id");
        System.out.println("Type of id field = " + id.getType());
        System.out.println();
    }

    private static void getFilds(Class employee) {
        Field[] fields = employee.getFields();
        for (Field field : fields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
    }

    private static void getDeclaredFields(Field[] declaredFields2) {
        System.out.println();
        Field[] declaredFields = declaredFields2;
        for (Field declaredField : declaredFields) {
            System.out.println("Type of " + declaredField.getName() + " = " + declaredField.getType());
        }
    }

    private static void method(Class employee) throws NoSuchMethodException {
        System.out.println();
        System.out.println("Working with methods:");
        Method increaseSalary = employee.getMethod("increaseSalary");
        System.out.println("Return type of method increaseSalary = " + increaseSalary.getReturnType() +
                ", parameter types = " + Arrays.toString(increaseSalary.getParameterTypes()));
    }

    private static Method getMethod(Class employee) throws NoSuchMethodException {
        System.out.println();
        Method someMethod = employee.getMethod("setSalary", double.class);
        System.out.println("Return type of method setSalary = " + someMethod.getReturnType() +
                ", parameter types = " + Arrays.toString(someMethod.getParameterTypes()));
        return someMethod;
    }

    private static void returnMethods(Class employee, Method someMethod) {
        System.out.println();
        Method[] methods = employee.getMethods();
        for (Method method : methods) {
            System.out.println("Name of method = " + method.getName() +
                    ", return type = " + method.getReturnType() +
                    ", parameter types = " + Arrays.toString(someMethod.getParameterTypes()));
        }
    }
}
