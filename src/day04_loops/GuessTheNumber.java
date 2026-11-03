package day04_loops;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int secret = 7;
        int guess = 0;
        int attempts = 0;

        Scanner sc = new Scanner(System.in);

        while (guess != secret) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > secret) {
                System.out.println("Too high.");
            } else if (guess < secret) {
                System.out.println("Too low.");
            }
        }

        System.out.println("Well done! Correct guess in " + attempts + " attempts.");

        sc.close();
    }
}