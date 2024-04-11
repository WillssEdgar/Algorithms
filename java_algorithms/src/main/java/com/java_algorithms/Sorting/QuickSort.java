package com.java_algorithms.Sorting;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int partitionIndex = low;
        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot) {
                swap(arr, i, partitionIndex);
                partitionIndex++;
            }
        }
        swap(arr, partitionIndex, high);
        return partitionIndex;
    }

    public static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 20, 100, 23, 50, 84, 43, 123 };

        System.out.print("Array before: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
        quickSort(arr, 0, arr.length - 1);
        System.out.print("Array after: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
