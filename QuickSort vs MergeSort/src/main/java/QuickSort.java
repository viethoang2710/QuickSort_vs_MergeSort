package org.example;

import java.util.Random;

public class QuickSort {
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);  // Recursively sort left subarray
            quickSort(arr, pi + 1, high); // Recursively sort right subarray
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivotIndex = new Random().nextInt(high - low + 1) + low;  // Choose a random pivot
        swap(arr, pivotIndex, high);  // Move pivot to the end
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high); // Place the pivot in the correct position
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
