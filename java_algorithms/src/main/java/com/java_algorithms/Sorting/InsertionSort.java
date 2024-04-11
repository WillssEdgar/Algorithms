package com.java_algorithms.Sorting;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 20, 100, 23, 50, 84, 43, 123 };

        System.out.print("Array before: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
        insertionSort(arr);
        System.out.print("Array after: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
