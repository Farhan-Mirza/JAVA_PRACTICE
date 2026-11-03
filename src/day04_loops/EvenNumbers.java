package day04_loops;

public class EvenNumbers {
    public static void main(String[] args) {

        System.out.println("Method 1: using if");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Number: " + i);
            }
        }

        System.out.println("Method 2: step of 2");
        for (int i = 2; i <= 50; i += 2) {
            System.out.println("Even Number: " + i);
        }
    }
}