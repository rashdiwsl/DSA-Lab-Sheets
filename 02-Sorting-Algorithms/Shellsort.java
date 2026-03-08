/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bhagy
 */
import java.util.Arrays;

public class Shellsort {
    public void sort(int[] array, int n) {
       
        for (int interval = n / 2; interval > 0; interval /= 2) {
            
            for (int i = interval; i < n; i++) {
             
                int temp = array[i];
                int j;
               
                for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
                    array[j] = array[j - interval];
                }
       
                array[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 17, 25, 8, 33, 31, 40, 42};

        System.out.println("Original array: " + Arrays.toString(array));
        Shellsort shellsort = new Shellsort();
        shellsort.sort(array, array.length);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
