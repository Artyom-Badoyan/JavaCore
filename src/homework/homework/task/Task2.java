package homework.homework.task;

/*
 * Дано целое Число. Определить является ли последняя цифра этого числа - цифрой 3.
 */
public class Task2 {
    public static void main(String[] args) {
        int value = 451583;
        int testValue = value % 10;

        if (testValue == 3) {
            System.out.println("Последнее цифра числа является 3:");
        } else {
            System.out.println("Последнее цифра числа не является 3:");
        }
    }
}
