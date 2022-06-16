package com.codedifferently;

public class SortExample {
    public static void main(String[] args) {
        int[] numbers = {40, 7, 59, 4, 1};
        boolean value = false;
        displayValues(numbers);
        //sequentialSearch(numbers, 13);
        //sequentialSearch(numbers, 7);
        value = binarySearch(numbers, 7);
        System.out.println(value);
        selectionSort(numbers);
        displayValues(numbers);
        value = binarySearch(numbers, 7);
        System.out.println(value);
        //bubbleSort(numbers);
        //displayValues(numbers);
    }

    public static  int[] mergeSort(int[] numbers){
        return null;
    }

    static boolean binarySearch(int[] numbers, int value){
        int low = 0;
        int high = numbers.length - 1;
        while(high >= low){
            int middle = (low + high)/2;
            if(numbers[middle] == value){
                return true;
            }
            if(numbers[middle] < value){
                low = middle + 1;
            }
            if(numbers[middle] > value){
                high = middle - 1;
            }
        }
        return false;
    }

    public static boolean sequentialSearch(int[] numbers, int value){
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == value) {
                return true;
            }
        }
        return false;
    }


    public static int[] bubbleSort(int[] numbers){ //time complexity O(N^2)
        for(int i =0; i < numbers.length; i++){         //nested for loop makes the time complexity worse
                                                    // (thus taking so long for larger sets of data)
            for (int j = 0; j < numbers.length-1; j++){
                if (numbers[j]> numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        return  numbers;
    }
    public static int[] selectionSort(int[] numbers){ //time complexity O(N^2)
        int indexMin = 0;
        for(int i = 0; i< numbers.length; i++){
            indexMin = i;
            for(int j = i + 1; j < numbers.length; j++){ //nested for loop makes the time complexity worse
                                                        // (thus taking so long for larger sets of data)
                if(numbers[j] < numbers[indexMin]){
                    indexMin = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[indexMin];
            numbers[indexMin] = temp;
        }
        return numbers;
    }

    public static void displayValues(int[] numbers) {
        for(int i = 0; i< numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }//endfor
        System.out.println("\n");
    }
}
