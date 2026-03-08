# Sorting Algorithms

This folder contains implementations of common **sorting algorithms** in Java:

- **Merge Sort** – MergeSortStocks.java  
- **Bubble Sort** – BubbleSort.java  
- **Shell Sort** – ShellSort.java  
- **Quick Sort** – QuickSort.java  

---

## Merge Sort – MergeSortStocks.java

**Description:**  
This program sorts an array of stock prices using the **Merge Sort algorithm**.  
Merge Sort is a **divide-and-conquer algorithm** with **time complexity O(n log n)** and is **stable**.

**Sample Output:**  

![Merge Sort Output](Q3_output.png)

---

## Bubble Sort – BubbleSort.java

**Description:**  
Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order.  
- Simple to implement but **inefficient for large arrays**.  
- Time complexity: **O(n²)**



## Shell Sort – ShellSort.java

**Description:**  
Shell Sort is an optimization over Insertion Sort that allows **exchange of far apart elements**.  
- Uses a gap sequence to reduce total swaps.  
- Time complexity depends on the gap sequence, usually **O(n log n)**


## Quick Sort – QuickSort.java

**Description:**  
QuickSort is a **divide-and-conquer algorithm** used to sort arrays efficiently.  
- Chooses a pivot (last element)  
- Partitions the array so smaller elements go left, larger go right  
- Recursively sorts left and right subarrays

