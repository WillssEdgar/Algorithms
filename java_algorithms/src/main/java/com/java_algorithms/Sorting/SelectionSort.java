package com.java_algorithms.Sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 20, 100, 23, 50, 84, 43, 123 };

        System.out.print("Array before: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
        selectionSort(arr);
        System.out.print("Array after: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
