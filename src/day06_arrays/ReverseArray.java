package day06_arrays;

import java.util.Arrays;

public class ReverseArray {

    static void reverse(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];

            arr[i] = arr[arr.length - 1 - i];

            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] nbr = {1, 2, 4, 5};

        System.out.println("Before Reversing: ");
        System.out.println(Arrays.toString(nbr));

        reverse(nbr);

        System.out.println("After Reversing: ");
        System.out.println(Arrays.toString(nbr));
    }
}