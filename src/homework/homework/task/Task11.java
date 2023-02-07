package homework.homework.task;

/*
 * Написать программу,заносящую в массив первые 100 целых чисел, делящихся на 13 или на 17, и печатающую его
 */
public class Task11 {
    public static void main(String[] args) {
        int[] values = new int[100];
        fillArray(values);
        printArray(values);
    }

    public static void fillArray(int[] values) {
        for (int currentValue = 1, currentIndex = 0; currentIndex < values.length; currentValue++) {
            if (currentValue % 13 == 0 || currentValue % 17 == 0) {
                values[currentIndex++] = currentValue;
            }
        }
    }

    public static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
}
