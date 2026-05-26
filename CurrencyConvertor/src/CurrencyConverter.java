import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // 1. Map initialization
        Map<String, Double> rates = Map.of
                (
                "USD", 1.00, "EUR", 0.92, "GBP", 0.79, "INR", 83.15, "JPY", 150.20
                );

        // 2. Try-with-resources
        try (Scanner scanner = new Scanner(System.in))
        {
            System.out.print("From (e.g., USD): ");
            String from = scanner.next().toUpperCase();

            System.out.print("To (e.g., EUR): ");
            String to = scanner.next().toUpperCase();

            System.out.print("Amount: ");
            double amount = scanner.nextDouble();

            // 3. exit if invalid
            if (!rates.containsKey(from) || !rates.containsKey(to)) {
                System.out.println("Error: Invalid currency code.");
                return;
            }

            // 4.  calculation
            double converted = (amount / rates.get(from)) * rates.get(to);
            System.out.printf("%.2f %s = %.2f %s%n", amount, from, converted, to);
        }
    }
}