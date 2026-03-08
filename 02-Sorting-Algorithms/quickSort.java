/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Labsheet04;

/**
 *
 * @author bhagy
 */
import java.util.Arrays;

public class quickSort {

    // QuickSort method
    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int p = partition(array, start, end);
            quickSort(array, start, p - 1); // Recursively sort the left subarray
            quickSort(array, p + 1, end);   // Recursively sort the right subarray
        }
    }

    // Partition method
    public static int partition(int[] array, int start, int end) {
        int pivot = array[end]; // Pivot element is the rightmost element
        int i = start - 1;      // Index of the smaller element

        for (int j = start; j < end; j++) {
            if (array[j] < pivot) {
                i++;
                // Swap array[i] with array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i+1] with array[end] (pivot)
        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;

        return i + 1; // Return the partitioning index
    }

    // Method to print the array
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {4, 10, 2, 19, 13, 15, 8, 11, 14, 5};
        System.out.println("Original Array:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted Array:");
        printArray(array);
    }
}

