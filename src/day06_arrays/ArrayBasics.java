package day06_arrays;

public class ArrayBasics {

    public static void main(String[] args) {

        // Way 1: create with a size, fill later
        int[] marks = new int[5];
        System.out.println("Default value at index 0: " + marks[0]);

        marks[4] = 80;
        marks[1] = 65;
        marks[2] = 90;
        marks[3] = 72;
        marks[0] = 55;

        System.out.println("First item: " + marks[0]);
        System.out.println("Last item: " + marks[4]);
        System.out.println("Length: " + marks.length);
        System.out.println("Last item using length: " + marks[marks.length - 1]);

        // Way 2: create with values directly (the size is worked out for you)
        String[] fruits = {"Apple", "Banana", "Mango"};
        System.out.println("Second fruit: " + fruits[1]);

        // Way 3: the long form of way 2
        double[] prices = new double[]{9.99, 4.5, 12.0};
        System.out.println("Third price: " + prices[2]);

        // Default values for other types
        boolean[] flags = new boolean[] {true, false, true};
        String[] names = new String[2];
        System.out.println("Default boolean: " + flags[0]);
        System.out.println("Default String: " + names[0]);
    }
}