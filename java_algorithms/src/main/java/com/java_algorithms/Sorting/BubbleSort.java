package com.java_algorithms.Sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
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
        bubbleSort(arr);
        System.out.print("Array after: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
