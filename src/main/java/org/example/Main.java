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
        obj.oddPosition(arr);
        obj.reverse(arr);

        obj.sortArrayAsc(arr);

        System.out.println("second largest : " +obj.secondlargestElements(arr));

        obj.duplicateElements(arr);

        //some code for sdet1

    }

    private void duplicateElements(int[] arr) {
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]==arr[j])
                    System.out.println("Duplicates elements are:"+arr[j]);
            }
        }
    }

    private int secondlargestElements(int[] arr) {
        int largest = largestElement(arr);
        int secondlargest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < largest && arr[i] > secondlargest){
                secondlargest=arr[i];
            }
        }
        return secondlargest;
    }


    private void sortArrayAsc(int[] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++)
            {
                int tmp=0;
                if(arr[i] > arr[j])
                {
                    tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
            System.out.println("sorted array "+arr[i]);
        }
    }

    private void reverse(int[] arr) {
        for(int i=arr.length-1; i>=0; --i){
            System.out.println("reverse order : " + arr[i]);
        }
    }

    private void oddPosition(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if(i%2==1)
                System.out.println("odd Position :" +i+ " element is " + arr[i]);
        }
    }

    private void evenPosition(int[] arr) {
        for(int i=0; i<arr.length;i++) {
            if (i % 2 == 0)
                System.out.println("even Position :" +i+ " element is " + arr[i]);
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