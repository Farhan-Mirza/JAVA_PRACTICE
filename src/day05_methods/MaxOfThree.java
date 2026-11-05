package day05_methods;

import java.util.Scanner;

public class MaxOfThree {

    static int max(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int nbr1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int nbr2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int nbr3 = sc.nextInt();

        System.out.println("The biggest number is: " + max(nbr1, nbr2, nbr3));

        sc.close();
    }
}