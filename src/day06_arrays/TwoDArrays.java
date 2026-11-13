package day06_arrays;

public class TwoDArrays {

    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("grid[1][2] = " + grid[1][2]);
        System.out.println("Rows: " + grid.length);
        System.out.println("Columns: " + grid[0].length);

        // Print the whole grid
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }

        // Sum of each row
        for (int row = 0; row < grid.length; row++) {
            int rowSum = 0;
            for (int col = 0; col < grid[row].length; col++) {
                rowSum = rowSum + grid[row][col];
            }
            System.out.println("Row " + row + " sum = " + rowSum);
        }
    }
}