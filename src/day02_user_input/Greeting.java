package day02_user_input;

import java.util.Scanner;

public class Greeting {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = sc.nextLine();

        System.out.print("Enter your age:");
        int age = sc.nextInt();

        System.out.println("Hello, " + name + "!");
        System.out.println("Next year you will be " + (age + 1));

        sc.close();
    }
}
