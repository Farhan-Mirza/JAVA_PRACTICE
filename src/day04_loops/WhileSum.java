package day04_loops;

import java.util.Scanner;

public class WhileSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.print("Enter a number (0 to stop): ");
        int number = sc.nextInt();

        while (number != 0) {
            total = total + number;
            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextInt();
        }

        System.out.println("Total = " + total);
        sc.close();
    }
}