package homework.homework4;

public class ArraySort {
    public static void main(String[] args) {

        /*
        Ունենք խառը թվերի դասավորած մասիվ՝ int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        Պետք է գրենք կոդ, որը մասիվի էլեմենտները կդասավորի մեծից փոքր։
        Այիսինքն մեր լոգիկան աշխատելուց հետո որ մասիվի բոլոր էլեմենտները տպենք,
        պետք է դասավորած աճման կարգով տպի բոլոր էլեմենտները։
        Սա ստացվելուց հետո մի հատ էլ նվազման կարգով դասավորեք։
        */

        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j - 1]) {
                    int num = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = num;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j] < numbers[j - 1]) {
                    int num = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = num;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
