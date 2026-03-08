/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bhagy
 */



import java.util.Random;

public class SortingComparison {

    public static int[] generateRandomArray(int size, int minValue, int maxValue) {
        int[] randomArray = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            randomArray[i] = random.nextInt((maxValue - minValue) + 1) + minValue;
        }

        return randomArray;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void shellSort(int[] array) {
        int n = array.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int size = 10000;
        int minValue = 1;
        int maxValue = 10000;

        int[] randomArray = generateRandomArray(size, minValue, maxValue);

        // Bubble Sort
        int[] bubbleSortArray = randomArray.clone();
        long startTime = System.currentTimeMillis();
        bubbleSort(bubbleSortArray);
        long endTime = System.currentTimeMillis();
        System.out.println("Bubble Sort took: " + (endTime - startTime) + " ms");

        // Selection Sort
        int[] selectionSortArray = randomArray.clone();
        startTime = System.currentTimeMillis();
        selectionSort(selectionSortArray);
        endTime = System.currentTimeMillis();
        System.out.println("Selection Sort took: " + (endTime - startTime) + " ms");

        // Insertion Sort
        int[] insertionSortArray = randomArray.clone();
        startTime = System.currentTimeMillis();
        insertionSort(insertionSortArray);
        endTime = System.currentTimeMillis();
        System.out.println("Insertion Sort took: " + (endTime - startTime) + " ms");

        // Shell Sort
        int[] shellSortArray = randomArray.clone();
        startTime = System.currentTimeMillis();
        shellSort(shellSortArray);
        endTime = System.currentTimeMillis();
        System.out.println("Shell Sort took: " + (endTime - startTime) + " ms");

     
    }
}
