package day06_arrays;

import java.util.Scanner;

public class MarksAnalyzer {

    static int sum(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total = total + mark;
        }
        return total;
    }

    static double average(int[] marks) {
        return (double) sum(marks) / marks.length;
    }

    static int highest(int[] marks) {
        int biggest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > biggest) {
                biggest = marks[i];
            }
        }
        return biggest;
    }

    static int lowest(int[] marks) {
        int smallest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < smallest) {
                smallest = marks[i];
            }
        }
        return smallest;
    }

    static int countAbove(int[] marks, double limit) {
        int count = 0;
        for (int mark : marks) {
            if (mark > limit) {
                count++;
            }
        }
        return count;
    }

    static int countPassed(int[] marks, int passMark) {
        int count = 0;
        for (int mark : marks) {
            if (mark >= passMark) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students? ");
        int students = sc.nextInt();

        if (students <= 0) {
            System.out.println("There must be at least 1 student.");
            sc.close();
            return;
        }

        int[] marks = new int[students];
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter student " + (i + 1) + " marks: ");
            marks[i] = sc.nextInt();
        }

        int passed = countPassed(marks, 50);

        System.out.println("Sum: " + sum(marks));
        System.out.printf("Average: %.2f%n", average(marks));
        System.out.println("Highest: " + highest(marks));
        System.out.println("Lowest: " + lowest(marks));
        System.out.println("Above average: " + countAbove(marks, average(marks)));
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + (marks.length - passed));

        sc.close();
    }
}