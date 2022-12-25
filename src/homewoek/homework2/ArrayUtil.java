package homewoek.homework2;

import jdk.swing.interop.SwingInterOpUtils;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {5, 10, 8, 15, 4, 6, 7, 20, 25, 14};

        int sum = 0;
        int countEvenNumbers = 0;
        int countOddNumbers = 0;
        int result = 0;

        //Տպեք մասիվի բոլոր էլեմենտները
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


        //Տպեք մասիվի ամենամեծ թիվը
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);


        //Տպեք մասիվի ամենափոքրը թիվը
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);


        //Տպեք մասիվի բոլոր զույգ էլեմենտները
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println();


        // Տպեք մասիվի բոլոր կենտ էլեմենտները։
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) != 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println();
        System.out.println("/////////////////////////////////////////////////");

        //Տպեք կենտերի քանակը
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) != 0) {
                countOddNumbers++;
            }
        }
        System.out.println("kent tveri qanak " + countOddNumbers);

        System.out.println("/////////////////////////////////////////////////");

        System.out.println(".............................................");
        //Տպեք զույգերի քանակը։
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                countEvenNumbers++;
            }
        }
        System.out.print(countEvenNumbers);

        System.out.println();
        System.out.println("................................................");


        //Տպեք մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        System.out.print(result / array.length);

        System.out.println();


        // * Տպեք մասիվի էլեմենտների գումարը։
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.print(sum);

        System.out.println();


        // Տպեք մասիվի առաջին էլեմենտը։
        System.out.print(array[0]);

        System.out.println();


        //Տպեք մասիվի վերջին էլեմենտը։
        System.out.print(array[array.length - 1]);

        System.out.println();


        //Տպեք մասիվի մեջտեղի էլեմենտը։
        System.out.print(array[array.length / 2]);


    }
}
