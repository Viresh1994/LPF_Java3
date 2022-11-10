package org.example;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 7, 3, 4, 6, 4, 6, 3, 35, 5, 5, 35, 322, 3, 5, 6, 6};
        Main obj = new Main();
        obj.printArray(arr);

    }

    private void printArray(int[] array) {
        for (int j : array) {
            System.out.println(j + " ");
        }
    }
}