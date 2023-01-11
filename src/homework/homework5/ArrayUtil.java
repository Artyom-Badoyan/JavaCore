package homework.homework5;

public class ArrayUtil {


    void elementsArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void oneAndMiddleAndLastElements(int[] array) {
        System.out.println("մասիվի առաջին էլեմենտը: " + array[0]);
        System.out.println("մասիվի մեջտեղի էլեմենտը: " + array[array.length / 2]);
        System.out.println("մասիվի վերջին էլեմենտը: " + array[array.length - 1]);
    }

    void maxOfArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.print("մասիվի ամենամեծ թիվը: " + max);
        System.out.println();
    }

    void minOfArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.print("մասիվի ամենափոքրը թիվ: " + min);
        System.out.println();
    }

    void evenElementsAndCount(int[] array) {
        int countEvenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                System.out.print(array[i] + " ");
                countEvenNumbers++;
            }
        }
        System.out.println();
        System.out.println("զույգ էլեմենտների քանակը: " + countEvenNumbers);
    }

    void oddElementsAndCount(int[] array) {
        int countOddNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) != 0) {
                System.out.print(array[i] + " ");
                countOddNumbers++;
            }
        }
        System.out.println();
        System.out.println("կենտ էլեմենտների քանակը: " + countOddNumbers);

    }

    void arithmeticMeanElements(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        System.out.println("Տպեք մասիվի էլեմենտների գումարը: " + result);
        System.out.print("մասիվի բոլոր թվերի միջին թվաբանականը: " + result / array.length);

    }
}
