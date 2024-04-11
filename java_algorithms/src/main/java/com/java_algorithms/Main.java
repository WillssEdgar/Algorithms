package com.java_algorithms;

import com.java_algorithms.Searching.BinarySearch;
import com.java_algorithms.Searching.BreadthFirstSearch.BreadthFirstSearchWithTree;
import com.java_algorithms.Searching.BreadthFirstSearch.BreadthFirstSearchWithTree.Tree;

public class Main {
    public static void main(String[] args) {
        // Binary Search
        String line = "-".repeat(30);
        System.out.println(line);
        System.out.println("This is Binary Search");
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int index = binarySearch.binarySearch(arr, 5);
        System.out.println("Index of n: " + index);
        System.out.println(line);

        // Breadth First Search with Tree
        System.out.println("This is Breadth First Search");
        BreadthFirstSearchWithTree bfs = new BreadthFirstSearchWithTree();
        Tree tree = bfs.new Tree();
        tree.insert(5);
        tree.insert(8);
        tree.insert(10);
        tree.insert(3);
        tree.insert(6);
        tree.insert(1);

        System.out.println("This is the tree: \n" + tree);
        int val = bfs.BreadthFirstSearch(10, tree);
        System.out.println("Result of Breadth First Search: " + val);
        System.out.println(line);

    }
}