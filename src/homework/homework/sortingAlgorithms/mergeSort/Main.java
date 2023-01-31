package homework.homework.sortingAlgorithms.mergeSort;

import static homework.homework.sortingAlgorithms.mergeSort.MergeSort.printArray;

public class Main {
    public static void main(String args[]) {
        int arr[] = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        System.out.println("Before Merge Sort");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("After Merge Sort");
        printArray(arr);
    }
}


