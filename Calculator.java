import java.util.Scanner;

public class Calculator {

    // Core Logic Methods
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    // Main CLI Method
    public static void main(String[] args) {
        if (args.length == 3) {
            // CLI Mode: java Calculator add 10 5
            try {
                String op = args[0];
                double num1 = Double.parseDouble(args[1]);
                double num2 = Double.parseDouble(args[2]);

                switch (op.toLowerCase()) {
                    case "add": System.out.println(add(num1, num2)); break;
                    case "sub": System.out.println(subtract(num1, num2)); break;
                    case "mul": System.out.println(multiply(num1, num2)); break;
                    case "div": System.out.println(divide(num1, num2)); break;
                    default: System.out.println("Unknown operation. Use: add, sub, mul, div");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else {
            System.out.println("Usage: java Calculator <add|sub|mul|div> <num1> <num2>");
        }
    }
}