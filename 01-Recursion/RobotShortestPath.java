/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question02;

/**
 *
 * @author bhagy
 */
public class RobotShortestPath {

    public static void main(String[] args) {
        int[][] grid = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };
        
        int minCost = findShortestPath(grid, 0, 0);
        System.out.println("Minimum path cost: " + minCost);
    }

    public static int findShortestPath(int[][] grid, int x, int y) {
        if (x == grid.length - 1 && y == grid[0].length - 1) {
            return grid[x][y];
        }
        
        if (x >= grid.length || y >= grid[0].length) {
            return Integer.MAX_VALUE;
        }
        
        int right = findShortestPath(grid, x, y + 1);
        int down = findShortestPath(grid, x + 1, y);
        
        return grid[x][y] + Math.min(right, down);
    }
}
