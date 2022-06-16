package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codedifferently.SortExample.*;


public class SortExampleTest {

    @Test
    @DisplayName("testing for selection sort")
    public void selectionSortTest01(){
        int[] numbers = {40,7,59,4,1};
        int[] expected = {1,4,7,40,59};
        int[] actual = bubbleSort(numbers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("testing for bubble sort")
    public void bubbleSortTest01(){
        int[] numbers = {40,7,59,4,1};
        int[] expected = {1,4,7,40,59};
        int[] actual = bubbleSort(numbers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("testing for sequential search")
    public void sequentialSearchTest01(){
        int[] numbers = {40,7,59,4,1};
        boolean actual = sequentialSearch(numbers, 40);
        Assertions.assertTrue(actual);
    }

    @Test
    @DisplayName("binary search test")
    public void binarySearchTest01(){
        int[] numbers = {1,4,7,40,59};

        boolean actual = binarySearch(numbers, 7);
        Assertions.assertTrue(actual);
    }
}
