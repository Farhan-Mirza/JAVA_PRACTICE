package day03_if_else;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int nbr = sc.nextInt();

        if(nbr > 0) {
            System.out.println("The number is positive.");
        } else if (nbr < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        if(nbr % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        sc.close();
    }
}
