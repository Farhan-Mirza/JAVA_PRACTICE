package day06_arrays;

import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.print("In reverse: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int evenCount = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Even numbers: " + evenCount);

        sc.close();
    }
}