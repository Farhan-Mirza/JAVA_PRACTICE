
package day06_arrays;

import java.util.*;

public class MarksAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many Students? ");
        int students = sc.nextInt();

        int[] marks = new int[students];
        // Taking marks input
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter Student " + (i + 1) + " marks: ");
            marks[i] = sc.nextInt();
        }

        // Calculating sum
        int sum = 0;
        for (int mark : marks) {
            sum = sum + mark;
        }
        System.out.println("The sum of marks is: " + sum);

        // Calculating average
        double average = (double) sum / marks.length;
        System.out.printf("The average is: %.2f%n", average);

        // Finding biggest mark
        int biggest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > biggest) {
                biggest = marks[i];
            }
        }
        System.out.println("The biggest is: " + biggest);

        int smallest = marks[0];
        for(int i=1; i < marks.length; i++) {
            if(marks[i] < smallest) {
                smallest = marks[i];
            }
        }
        System.out.println("The smallest is: " + smallest);

        sc.close();
    }
}
