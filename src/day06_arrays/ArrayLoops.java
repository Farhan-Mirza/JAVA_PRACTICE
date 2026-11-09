package day06_arrays;

public class ArrayLoops {

    static int sum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        return total;
    }

    static double average(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    static int max(int[] arr) {
        int biggest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > biggest) {
                biggest = arr[i];
            }
        }
        return biggest;
    }

    static int min(int[] arr) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] marks = {80, 65, 90, 72, 55};

        // Loop 1: classic for loop (when you need the index)
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[" + i + "] = " + marks[i]);
        }

        // Loop 2: for-each loop (when you only need the values)
        System.out.print("All marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();

        System.out.println("Sum = " + sum(marks));
        System.out.printf("Average = %.2f%n", average(marks));
        System.out.println("Highest = " + max(marks));
        System.out.println("Lowest = " + min(marks));
    }
}