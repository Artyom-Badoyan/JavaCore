package homework.homework;

public class LogicalOperations {
    public static void main(String[] args) {

        int value = 4;
        int value1 = 2;
        int sum = value + value1;
        System.out.println(sum);

        int sum1 = value - value1;
        System.out.println(sum1);

        int sum2 = value * value1;
        System.out.println(sum2);

        double sum3 = (double) value / value1;
        System.out.println(sum3);

        int sum4 = value % value1;
        System.out.println(sum4);

        int appropriate = 5;
        appropriate += 10; // -= *= /= %=
        System.out.println(appropriate);

        int increment = 10;
        increment++;
        System.out.println(increment);

        int decrement = 10;
        decrement--;
        System.out.println(decrement);

        int booleanValue = 10;
        boolean test = booleanValue > 0; // < >= <= == != !
        System.out.println(test);

        int num1 = 0;
        int num2 = 10;
        boolean test1 = num1 != 0;
        boolean test2 = num2 > 0;
        System.out.println(test1 && test2);
        System.out.println(test1 || test2);
    }
}
