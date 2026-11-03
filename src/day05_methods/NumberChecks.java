package day05_methods;

public class NumberChecks {

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static boolean isPositive(int n) {
        return n > 0;
    }

    public static void main(String[] args) {
        for (int i = -2; i <= 5; i++) {
            System.out.println(i + " -> even: " + isEven(i) + ", positive: " + isPositive(i));
        }
    }
}