/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question03;

/**
 *
 * @author bhagy
 */
public class MergeSortStocks{

    
    void merge(double a[], int beg, int mid, int end) {
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        double[] LeftArray = new double[n1];
        double[] RightArray = new double[n2];

       
        for (int i = 0; i < n1; i++)
            LeftArray[i] = a[beg + i];
        for (int j = 0; j < n2; j++)
            RightArray[j] = a[mid + 1 + j];

        int i = 0, j = 0;
        int k = beg;

        while (i < n1 && j < n2) {
            if (LeftArray[i] <= RightArray[j]) {
                a[k] = LeftArray[i];
                i++;
            } else {
                a[k] = RightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = RightArray[j];
            j++;
            k++;
        }
    }

    
    void mergeSort(double a[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            mergeSort(a, beg, mid);
            mergeSort(a, mid + 1, end);
            merge(a, beg, mid, end);
        }
    }

    public static void main(String[] args) {
        double[] stockPrices = {203, 45, 189.78, 202.56, 198.88, 215.12, 190.23, 199.99};

        MergeSortStocks ob = new MergeSortStocks();
        ob.mergeSort(stockPrices, 0, stockPrices.length - 1);

        System.out.println("Stock Prices After Sorting:");
        for (double price : stockPrices) {
            System.out.print(price + " ");
        }
    }
}

/*Question 03
Sorting Stock Prices Using Merge Sort
Given the appendix, the Merge Sort algorithm is well-suited for sorting stock prices due to its efficiency and stability. 

Merge Sort: time complexity- O(n log n) and stable sorting nature.
Quick Sort : worst case-O(n²) making it less predictable for large datasets.
Shell Sort: less efficient than Merge Sort in handling large datasets with random data.
*/

