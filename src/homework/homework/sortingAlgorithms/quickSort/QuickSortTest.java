package homework.homework.sortingAlgorithms.quickSort;

import java.util.Arrays;

public class QuickSortTest {
    public static void main(String args[]) {
        int[] data = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(data));

        int size = data.length;
        QuickSort.quickSort(data, 0, size - 1);

        System.out.println("Sorted Array in Ascending Order ");
        System.out.println(Arrays.toString(data));
    }
}

