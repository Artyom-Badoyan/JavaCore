package homework.homework.sortingAlgorithms.insertionSort;

import static homework.homework.sortingAlgorithms.insertionSort.InsertionSort.insertionSort;

public class InsertionSortTest {
    public static void main(String a[]) {
        int[] arr1 = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println("Before Insertion Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        insertionSort(arr1);
        System.out.println("After Insertion Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}
