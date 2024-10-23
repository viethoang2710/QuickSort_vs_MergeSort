package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 10000;  // Array size
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        // Generate random integers for both arrays
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr1[i] = rand.nextInt(10000);
            arr2[i] = arr1[i];  // Ensure both arrays are identical
        }

        // Quick Sort
        QuickSort quickSort = new QuickSort();
        long startTime = System.nanoTime();
        quickSort.quickSort(arr1, 0, arr1.length - 1);
        long endTime = System.nanoTime();
        System.out.println("Quick Sort took: " + (endTime - startTime) + " nanoseconds");

        // Merge Sort
        MergeSort mergeSort = new MergeSort();
        startTime = System.nanoTime();
        mergeSort.mergeSort(arr2, 0, arr2.length - 1);
        endTime = System.nanoTime();
        System.out.println("Merge Sort took: " + (endTime - startTime) + " nanoseconds");

        // Optionally, check if both arrays are sorted
        System.out.println("Quick Sort Result: " + Arrays.toString(Arrays.copyOfRange(arr1, 0, 10)));  // Print first 10 elements
        System.out.println("Merge Sort Result: " + Arrays.toString(Arrays.copyOfRange(arr2, 0, 10)));  // Print first 10 elements
    }
}
