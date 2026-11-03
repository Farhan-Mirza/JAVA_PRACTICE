package day05_methods;

public class MethodBasics {
    // No parameters, returns nothing
    static void sayHello() {
        System.out.println("Hello from a method!");
    }

    // One parameter, returns nothing
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Two parameters, returns an int
    static int add(int a, int b) {
        return a + b;
    }

    static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        sayHello();
        greet("Farhan");

        int result = add(5, 3);
        System.out.println("5 + 3 = " + result);

        System.out.println("Square of 4 = " + square(4));
    }
}