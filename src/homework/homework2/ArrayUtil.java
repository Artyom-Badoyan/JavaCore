package homework.homework2;

public class ArrayUtil {
    public static void main(String[] args) {

        /**
         Տպեք մասիվի բոլոր էլեմենտները
         Տպեք մասիվի ամենամեծ թիվը
         Տպեք մասիվի ամենափոքրը թիվը
         Տպեք մասիվի բոլոր զույգ էլեմենտները,
         Տպեք մասիվի բոլոր կենտ էլեմենտները։
         Տպեք զույգերի քանակը։
         Տպեք կենտերի քանակը
         Տպեք մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)
         Տպեք մասիվի էլեմենտների գումարը։
         Տպեք մասիվի առաջին էլեմենտը։
         Տպեք մասիվի վերջին էլեմենտը։
         Տպեք մասիվի մեջտեղի էլեմենտը։
         */

        int[] array = {5, 10, 8, 15, 4, 6, 7, 20, 25, 14};

        int countEvenNumbers = 0;
        int countOddNumbers = 0;
        int result = 0;

        //Տպեք մասիվի բոլոր էլեմենտները
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //Տպեք մասիվի առաջին էլեմենտը։
        //Տպեք մասիվի մեջտեղի էլեմենտը։
        //Տպեք մասիվի վերջին էլեմենտը։
        System.out.println("մասիվի առաջին էլեմենտը: " + array[0]);
        System.out.println("մասիվի մեջտեղի էլեմենտը: " + array[array.length / 2]);
        System.out.println("մասիվի վերջին էլեմենտը: " + array[array.length - 1]);

        //Տպեք մասիվի ամենամեծ թիվը
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.print("մասիվի ամենամեծ թիվը: " + max);
        System.out.println();

        //Տպեք մասիվի ամենափոքրը թիվը
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.print("մասիվի ամենափոքրը թիվ: " + min);
        System.out.println();

        //Տպեք մասիվի բոլոր զույգ էլեմենտները
        //Տպեք զույգերի քանակը։
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                System.out.print(array[i] + " ");
                countEvenNumbers++;
            }
        }
        System.out.println();
        System.out.println("զույգ էլեմենտների քանակը: " + countEvenNumbers);


        // Տպեք մասիվի բոլոր կենտ էլեմենտները։
        // Տպեք կենտերի քանակը
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) != 0) {
                System.out.print(array[i] + " ");
                countOddNumbers++;
            }
        }
        System.out.println();
        System.out.println("կենտ էլեմենտների քանակը: " + countOddNumbers);


        //Տպեք մասիվի էլեմենտների գումարը։
        //Տպեք մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        System.out.println("Տպեք մասիվի էլեմենտների գումարը: " + result);
        System.out.print("մասիվի բոլոր թվերի միջին թվաբանականը: " + result / array.length);

    }
}
