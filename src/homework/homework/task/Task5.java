package homework.homework.task;

/*
 * Написать программу высчитывающую факториал введенного целого числа
 */
public class Task5 {
    public static void main(String[] args) {
        int value = 5;

        int result = factorial(value);
        System.out.println(result);

        int resultWhile = factorialWhile(value);
        System.out.println(resultWhile);

    }

    public static int factorialWhile(int value) {
        int result = 1;
        int i = 1;
        while (i <= value) {
            result *= i;
            i++;
        }
        return result;
    }

    public static int factorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }
}
