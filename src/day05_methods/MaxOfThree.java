package day05_methods;

import java.util.Scanner;

public class MaxOfThree {

    static int max(int a, int b, int c) {
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        int nbr1 = sc.nextInt();

        System.out.print("Enter second Number: ");
        int nbr2 = sc.nextInt();

        System.out.print("Enter third Number: ");
        int nbr3 = sc.nextInt();

        if (nbr1 > nbr2) {
            System.out.println("The biggest Number is: " +nbr1);
        } else if (nbr1 < nbr2) {
            System.out.println("The biggest Number is: " +nbr2);
        } else if (nbr2 > nbr3) {
            System.out.println("The biggest Number is: " +nbr2);
        } else if (nbr2 < nbr3) {
            System.out.println("The biggest Number is: " +nbr3);
        } else if (nbr1 > nbr3) {
            System.out.println("The biggest Number is: " +nbr1);
        } else if (nbr1 < nbr3) {
            System.out.println("The biggest Number is: " +nbr3);
        }

        sc.close();
    }
}