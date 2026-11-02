package day04_loops;

public class ForLoopBasics {

    public static void main(String[] args) {
        // Print 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // Add the numbers 1 to 10
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of 1 to 10 = " + sum);
    }
}