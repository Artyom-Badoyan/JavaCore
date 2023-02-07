package homework.homework.task;

/*
 * Имеется число. Посчитать сумму цифр данного числа.
 */
public class Task6 {
    public static void main(String[] args) {
        int value = 12345;
        int result = sum(value);
        System.out.println(result);

        int result1 = sumFor(value);
        System.out.println(result1);

    }

    public static int sum(int value) {
        int result = 0;
        int currentValue = value;
        while (currentValue != 0) {
            result += currentValue % 10;
            currentValue /= 10;
        }
        return result;
    }

    public static int sumFor(int value) {
        int result = 0;
        for (int currentValur = value; currentValur != 0; currentValur /= 10) {
            result += currentValur % 10;
        }
        return result;
    }
}
