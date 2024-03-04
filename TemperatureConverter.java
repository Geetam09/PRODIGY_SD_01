import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter original unit of measurement (C, F, or K): ");
        String originalUnit = scanner.next().toUpperCase();
        
        // Convert temperature based on original unit
        double convertedToFahrenheit = 0;
        double convertedToCelsius = 0;
        double convertedToKelvin = 0;
        
        switch(originalUnit) {
            case "C":
                convertedToFahrenheit = (temperature * 9/5) + 32;
                convertedToKelvin = temperature + 273.15;
                convertedToCelsius = temperature;
                break;
            case "F":
                convertedToCelsius = (temperature - 32) * 5/9;
                convertedToKelvin = (temperature + 459.67) * 5/9;
                convertedToFahrenheit = temperature;
                break;
            case "K":
                convertedToCelsius = temperature - 273.15;
                convertedToFahrenheit = (temperature * 9/5) - 459.67;
                convertedToKelvin = temperature;
                break;
            default:
                System.out.println("Invalid unit of measurement. Please enter C, F, or K.");
                return;
        }
        
        // Display converted temperatures
        System.out.println("Temperature in Celsius: " + convertedToCelsius + "°C");
        System.out.println("Temperature in Fahrenheit: " + convertedToFahrenheit + "°F");
        System.out.println("Temperature in Kelvin: " + convertedToKelvin + "K");
        
        scanner.close();
    }
}
