package com.java_algorithms.Searching;

public class BinarySearch {
    public int helper(int[] arr, int n, int low, int high) {
        if (low <= high) {
            int midpoint = low + (high - low) / 2;
            if (arr[midpoint] == n) {
                return midpoint;
            } else if (arr[midpoint] > n) {
                return helper(arr, n, low, midpoint - 1);
            } else {
                return helper(arr, n, midpoint + 1, high);
            }
        }
        return -1;
    }

    public int binarySearch(int[] arr, int n) {
        return helper(arr, n, 0, arr.length - 1);
    }
}
