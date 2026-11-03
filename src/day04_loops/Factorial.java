package day04_loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        long result = 1;

        for (int i = 1; i <= number; i++) {
            result = result * i;
        }

        System.out.println("The factorial of " + number + " is: " + result);
        sc.close();
    }
}