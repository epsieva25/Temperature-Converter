import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.print("Enter the temperature value: ");
        double temp = scanner.nextDouble();
        scanner.nextLine();  // Consume newline left-over
        System.out.print("Enter the unit of measurement (C for Celsius, F for Fahrenheit): ");
        String unit = scanner.nextLine().trim().toUpperCase();

        if (unit.equals("C")) {
            double convertedTemp = celsiusToFahrenheit(temp);
            System.out.printf("%.2f°C is %.2f°F%n", temp, convertedTemp);
        } else if (unit.equals("F")) {
            double convertedTemp = fahrenheitToCelsius(temp);
            System.out.printf("%.2f°F is %.2f°C%n", temp, convertedTemp);
        } else {
            System.out.println("Invalid unit of measurement. Please enter C for Celsius or F for Fahrenheit.");
        }

        scanner.close();
    }
}
