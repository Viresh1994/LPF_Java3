package org.example;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 7, 3, 4, 6, 4, 6, 3, 35, 5, 5, 35, 322, 3, 5, 6, 6,0};
        Main obj = new Main();
        obj.printArray(arr);
        System.out.println("+++++++++++++++++++++++");
        int size = arr.length;
        countFrequency(arr, size);

        System.out.println("Largest elements from array : " +obj.largestElement(arr));
        System.out.println("Smallest elements from array : " +obj.smallestElement(arr));

        obj.evenPosition(arr);

    }

    private void evenPosition(int[] arr) {
        for(int i=0; i<arr.length;i++) {
            if (i % 2 == 0)
                System.out.println("Position :" +i+ " element is " + arr[i]);
        }
    }

    private int smallestElement(int[] arr) {
        int smallest=arr[0];
        for(int i=0; i<arr.length; i++){
            if(smallest > arr[i])
                smallest=arr[i];
        }
        return smallest;
    }

    private int largestElement(int[] arr) {
        int largest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(largest < arr[i])
                largest=arr[i];
        }
        return largest;
    }

    private static void countFrequency(int[] arr, int size) {
        for(int i=0; i<size; i++){
            int flag=0;
            int count=0;
            for(int j=i+1; j<size; j++){
                if(arr[i] == arr[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==1)
                continue;
            for(int j=0; j<=i; j++){
                if(arr[i]==arr[j])
                    count++;
            }
            System.out.println(arr[i]+ ": "+count);
        }
    }

    private void printArray(int[] array) {
        for (int j : array) {
            System.out.println(j + " ");
        }
    }
}