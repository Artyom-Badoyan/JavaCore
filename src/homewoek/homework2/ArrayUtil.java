package homewoek.homework2;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {5, 10, 8, 15, 4, 6, 7, 20, 25, 14};

        //Տպեք մասիվի բոլոր էլեմենտները
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //Տպեք մասիվի ամենամեծ թիվը
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);

        //Տպեք մասիվի ամենափոքրը թիվը
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
