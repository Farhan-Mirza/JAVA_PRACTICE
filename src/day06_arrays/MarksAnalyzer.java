package day06_arrays;

import java.util.*;

public class MarksAnalyzer {

    public static void main(String[] args ) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many Students? ");
        int students = sc.nextInt();

        int[] marks = new int[students];

        for(int i=0; i < marks.length; i++) {
            System.out.print("Enter Student " + (i + 1) + " marks: ");
            marks[i] = sc.nextInt();
        }

        int sum = 0;
        for(int mark : marks) {
            sum = sum + mark;
        }
        System.out.println("The sum of marks is: " + sum);

        double average = sum / marks.length;
        System.out.println("The average is: " + average);

        int biggest = 0;
        for(int i = 0; i < marks.length; i++) {

        }
    }
}
