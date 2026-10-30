package day02_user_input;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width of Rectangle: ");
        Double width = sc.nextDouble();

        System.out.print("Enter height of Rectangle: ");
        Double height = sc.nextDouble();

        System.out.println("The Area of Rectangle is: " + (width * height));
        System.out.println("The Perimeter of Rectangle is:" + (2 * (width + height)));
    }
}
