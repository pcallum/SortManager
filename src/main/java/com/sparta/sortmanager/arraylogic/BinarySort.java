package com.sparta.sortmanager.arraylogic;

import static com.sparta.sortmanager.control.LogDriver.logger;

public class BinarySort implements Sorters {
    // takes the current position in the tree and adds a value into the tree, returning the new node created for it
    public Node addValue(Node root, int value) {

        if (root == null) {
            return new Node(value);
        }

        if (value < root.value) {
            root.left = addValue(root.left, value);
        } else if (value > root.value) {
            root.right = addValue(root.right, value);
        } else {
            root.amount++;
        }
        return root;
    }

    int orderArray(Node root, int[] arr, int count) {
        if (root.left != null) {
            count = orderArray(root.left, arr, count);
        }

        for (int i = 0; i < root.amount; i++) {
            arr[count++] = root.value;
        }

        if (root.right != null) {
            count = orderArray(root.right, arr, count);
        }
        return count;
    }

    public int[] binarySort(int[] arr) {
        Node root = null;

        for (int i : arr) {
            root = addValue(root, i);
        }

        orderArray(root, arr, 0);

        return arr;
    }

    @Override
    public int[] returnSorted(int[] arr) {
        return binarySort(arr);
    }


    class Node {
        int value;
        int amount;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            this.amount = 1;
            left = null;
            right = null;
        }
    }
}
