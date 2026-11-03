package day05_methods;

import java.util.Scanner;

public class Calculator {

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println("Result: " + add(first, second));
        } else if (op == '-') {
            System.out.println("Result: " + subtract(first, second));
        } else if (op == '*') {
            System.out.println("Result: " + multiply(first, second));
        } else if (op == '/') {
            if (second == 0) {
                System.out.println("Cannot divide by zero.");
            } else {
                System.out.println("Result: " + divide(first, second));
            }
        } else {
            System.out.println("Invalid operation.");
        }

        sc.close();
    }
}