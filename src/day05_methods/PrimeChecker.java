package day05_methods;

public class PrimeChecker {

    // Job 1: Check whether one number is prime
    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Job 2: Print prime numbers from 1 to 50
    public static void main(String[] args) {

        for (int number = 1; number <= 50; number++) {

            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }
}