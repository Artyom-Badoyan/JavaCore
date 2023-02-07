package homework.homework.task;

/*
 * Определить сумму элементов целочисленного массива расположенных между минимальным и максимальным значениями
 */
public class Task13 {

    public static void main(String[] args) {

        int[] values = {1, 2, 0, 5, 6, 4, 10, 3};
        System.out.println("max index: " + findMaxIndex(values));
        System.out.println("min index: " + findMinIndex(values));
        System.out.println(calculateSumBetWeen(values));
    }

    public static int calculateSumBetWeen(int[] values) {
        int minIndex = findMinIndex(values);
        int maxIndex = findMaxIndex(values);
        if (minIndex > maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }
        
        int result = 0;
        for (int i = minIndex + 1; i < maxIndex; i++) {
            result += values[i];

        }
        return result;
    }

    public static int findMinIndex(int[] values) {
        int minIndex = 0;
        int minValue = values[minIndex];
        for (int i = 0; i < values.length; i++) {
            if (minValue > values[i]) {
                minValue = values[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int findMaxIndex(int[] values) {
        int maxIndex = 0;
        int maxValue = values[maxIndex];
        for (int i = 0; i < values.length; i++) {
            if (maxValue < values[i]) {
                maxValue = values[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
