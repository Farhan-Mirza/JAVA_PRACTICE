package day03_if_else;

import java.util.Scanner;

public class TicketCalculator {
    public static void main(String[] args) {
        int price = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ahhh! So you need a ticket.");
        System.out.print("Here, enter your age: ");
        int age = sc.nextInt();

        System.out.print("Are you a Student? (Y = 1 / N = 2): ");
        int student = sc.nextInt();

        System.out.print("Enter the day (1-7): ");
        int day = sc.nextInt();

        // Base price by age
        if (age < 5) {
            System.out.println("Your ticket is for free.");
        } else if (age <= 12) {
            price = 5;
        } else if (age <= 59) {
            price = 10;
        } else {
            price = 6;
        }

        // Student discount
        if (student == 1 && age >= 13) {
            price = price - 2;
        }

        // Weekend surcharge (not for free tickets)
        if ((day == 6 || day == 7) && age >= 5) {
            price = price + 3;
        }

        // Price can never be negative
        if (price < 0) {
            price = 0;
        }

        System.out.println("Your ticket price is $" + price);

        sc.close();
    }
}