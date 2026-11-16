package day06_arrays;

import java.util.*;

public class LinearSearch {

    static int indexOf(int[] arr, int target) {

        for(int i=0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nbr = {10, 20, 30, 20};

        System.out.println(Arrays.toString(nbr));
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();

        int index = indexOf(nbr, target);

        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index " + index);
        }

        sc.close();
    }
}
