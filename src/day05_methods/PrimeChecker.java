package day05_methods;

public class PrimeChecker {

    // Job 1: answer "is this one number prime?"
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if ((n & i) == 0) {
                return false;
            }
        }

        return true;
    }

    // Job 2: go through 1 to 50 and print the primes
    public static void main(String[] args) {
        for (int number = 1; number <= 50; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }
}