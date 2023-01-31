package homework.homework.sortingAlgorithms.bubbleSort;

import static homework.homework.sortingAlgorithms.bubbleSort.BubbleSort.bubbleSort;

public class BubbleSortTest {
    public static void main(String[] args) {
        int arr[] = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
