package homework.homework.sortingAlgorithms.selectionSort;

import static homework.homework.sortingAlgorithms.selectionSort.SelectionSort.selectionSort;

public class SelectionSortTest {
    public static void main(String a[]) {
        int[] arr1 = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println("Before Selection Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        selectionSort(arr1);
        System.out.println("After Selection Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}
