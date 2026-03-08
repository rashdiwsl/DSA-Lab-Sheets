# Recursion Algorithms in Java

This section contains Java implementations of recursion-based problems from the Data Structures and Algorithms (DSA) lab exercises.

---

## Question 01 – Medal Count Using Recursion

### Problem

A country participates in several sports competitions where medals are awarded as **Gold, Silver, and Bronze**. Each sport has a specific number of medals.

The task is to calculate the **total number of medals** won across all sports using **recursion**.

### Approach

* Medal counts are stored in a **2D array**.
* Each row represents a sport.
* Columns represent **Gold, Silver, and Bronze medals**.
* A recursive function processes each row and accumulates the totals.

### Output Screenshot

![MedalCount Output](01-Recursion/Q1_output.png)

---

## Question 02 – Robot Shortest Path

### Problem

A robot must move from the **top-left corner to the bottom-right corner** of a grid.
Each cell contains a cost value, and the robot can move **only right or down**.

The objective is to calculate the **minimum path cost** using recursion.

### Approach

* The grid is represented using a **2D array**.
* The recursive function explores both possible moves:

  * Move **right**
  * Move **down**
* The algorithm chooses the **minimum cost path** until it reaches the destination.

### Output Screenshot

![RobotShortestPath Output](01-Recursion/Q2_output.png)

---

## Technologies Used

* Java
* Recursion
* 2D Arrays

---

## Author

Rashmi Rathnayake
Software Engineering Undergraduate
General Sir John Kotelawala Defence University
