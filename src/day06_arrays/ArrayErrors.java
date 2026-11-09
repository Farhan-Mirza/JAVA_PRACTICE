package day06_arrays;

public class ArrayErrors {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        System.out.println("This line runs.");
        System.out.println(numbers[3]);
        System.out.println("This line never runs.");
    }
}