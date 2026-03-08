/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Labsheet05;

/**
 *
 * @author bhagy
 */
// Radix Sort implementation in Java
import java.util.Arrays;

public class radixSort {

    // A utility function to get the maximum value in the array
    static int getMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // A function to do counting sort of arr[] according to the digit represented by exp
    static void countingSort(int arr[], int n, int exp) {
        int output[] = new int[n]; // Output array to store sorted elements
        int count[] = new int[10]; // Count array to store count of digits (0-9)
        Arrays.fill(count, 0);

        // Store count of occurrences of each digit in count array
        for (int i = 0; i < n; i++) {
            int index = (arr[i] / exp) % 10;
            count[index]++;
        }

        // Change count[i] so that it contains actual position of this digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            int index = (arr[i] / exp) % 10;
            output[count[index] - 1] = arr[i];
            count[index]--;
        }

        // Copy the output array to arr[], so that arr now contains sorted numbers
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // The main function to that sorts arr[] of size n using Radix Sort
    static void radixSort(int arr[], int n) {
        // Find the maximum number to know the number of digits
        int max = getMax(arr, n);

        // Do counting sort for every digit
        // Instead of passing digit number, exp is passed. exp is 10^i
        // where i is current digit number
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, n, exp);
        }
    }

    // A utility function to print an array
    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Driver Code
    public static void main(String[] args) {
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};
        int n = arr.length;

        System.out.println("Original array: ");
        printArray(arr, n);

        radixSort(arr, n);

        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}
