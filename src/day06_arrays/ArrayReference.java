package day06_arrays;

import java.util.Arrays;

public class ArrayReference {

    static void doubleAll(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }

    static void changeNumber(int x) {
        x = 100;
    }

    public static void main(String[] args) {

        // Part 1: = does NOT copy an array
        int[] a = {1, 2, 3};
        int[] b = a;
        b[0] = 99;
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));

        // Part 2: a real copy
        int[] c = Arrays.copyOf(a, a.length);
        c[1] = 77;
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("c = " + Arrays.toString(c));

        // Part 3: methods can change an array you pass in
        int[] nums = {1, 2, 3};
        doubleAll(nums);
        System.out.println("nums after doubleAll = " + Arrays.toString(nums));

        // Part 4: but not a plain number
        int n = 5;
        changeNumber(n);
        System.out.println("n after changeNumber = " + n);
    }
}