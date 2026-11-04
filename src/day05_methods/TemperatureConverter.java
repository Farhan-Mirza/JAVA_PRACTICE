package day05_methods;

import java.util.Scanner;

public class TemperatureConverter {

    static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temp = sc.nextDouble();

        System.out.print("Convert to (F = Fahrenheit, C = Celsius): ");
        char target = Character.toUpperCase(sc.next().charAt(0));

        if (target == 'F') {
            System.out.printf("%.2f°C = %.2f°F%n", temp, celsiusToFahrenheit(temp));
        } else if (target == 'C') {
            System.out.printf("%.2f°F = %.2f°C%n", temp, fahrenheitToCelsius(temp));
        } else {
            System.out.println("Invalid conversion.");
        }

        sc.close();
    }
}