package com.java_algorithms.Searching.BreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearchWithTree {
    public class Tree {
        TreeNode root;

        public Tree() {
            root = null;
        }

        public void insert(int val) {
            root = insertRecursive(root, val);
        }

        private TreeNode insertRecursive(TreeNode current, int val) {
            if (current == null) {
                return new TreeNode(val);
            }
            if (val < current.val) {
                current.left = insertRecursive(current.left, val);
            } else if (val > current.val) {
                current.right = insertRecursive(current.right, val);
            }
            return current;
        }

        @Override
        public String toString() {
            StringBuilder s = new StringBuilder();
            inOrderTraversal(root, s);
            return s.toString();
        }

        public void inOrderTraversal(TreeNode node, StringBuilder s) {
            if (node != null) {
                inOrderTraversal(node.left, s);
                s.append(node.val).append(" "); // Append the node value and a space
                inOrderTraversal(node.right, s);
            }
        }

        public String helper(TreeNode root, int level) {
            StringBuilder s = new StringBuilder();
            TreeNode current = root;
            String space = "   ".repeat(3);

            while (current.right != null || current.left != null) {
                if (current.left != null) {
                    s.append(space + current.val + "\n");
                    helper(current.left, level);
                    current = current.left;
                } else {
                    s.append(space + current.val + "\n");
                }
                if (current.right != null) {
                    s.append(space + current.val + "\n");
                    helper(current.right, level + 1);
                    current = current.right;
                }
            }
            return s.toString();
        }
    }

    public int BreadthFirstSearch(int val, Tree tree) {
        TreeNode node = tree.root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            TreeNode current = queue.remove();
            System.out.println("Current Node: " + current.val);

            if (current.val == val) {
                return 1;
            }

            // Mark the node as visited after dequeuing
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        return -1;
    }

}
