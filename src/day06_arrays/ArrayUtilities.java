package day06_arrays;

import java.util.Arrays;

public class ArrayUtilities {

    public static void main(String[] args) {
        int[] numbers = {42, 7, 19, 3, 25};

        // Printing an array directly gives nonsense
        System.out.println(numbers);

        // Arrays.toString prints the contents
        System.out.println(Arrays.toString(numbers));

        // Sort (changes the original array)
        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));

        // Copy
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        int[] bigger = Arrays.copyOf(numbers, 8);
        System.out.println("Bigger: " + Arrays.toString(bigger));

        // Fill every slot with one value
        int[] filled = new int[5];
        Arrays.fill(filled, 9);
        System.out.println("Filled: " + Arrays.toString(filled));

        // Comparing arrays
        System.out.println("Same contents? " + Arrays.equals(numbers, copy));
        System.out.println("Same array? " + (numbers == copy));
    }
}