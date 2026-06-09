package com.example;

import java.util.Scanner;

public class MainRomanConverter {
    public static void main(String[] args) {
        RomanConverter converter = new RomanConverter();

        Scanner scanner = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("      ROMAN CONVERTER APPLICATION        ");
        System.out.println("   (Type 'end' at any time to exit)      ");
        System.out.println("=========================================");

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Convert Roman to Integer");
            System.out.println("2. Convert Integer to Roman");
            System.out.print("Enter choice (1, 2, or 'end'): ");

            String choice = scanner.nextLine().trim();

            if (choice.equalsIgnoreCase("end")) {
                break;
            }

            if (choice.equals("1")) {
                System.out.print("Enter a Roman numeral: ");
                String romanInput = scanner.nextLine().trim();

                if (romanInput.equalsIgnoreCase("end")) {
                    break;
                }

                try {
                    int result = converter.romanToInteger(romanInput);
                    System.out.println("Result: " + result);
                } catch (IllegalArgumentException e) {
                    System.out.println("❌ Error: " + e.getMessage());
                }

            } else if (choice.equals("2")) {
                System.out.print("Enter an integer number (1-3999): ");
                String intInput = scanner.nextLine().trim();

                if (intInput.equalsIgnoreCase("end")) {
                    break;
                }

                try {
                    int number = Integer.parseInt(intInput);
                    String result = converter.integerToRoman(number);
                    System.out.println("Result: " + result);
                } catch (NumberFormatException e) {
                    System.out.println("❌ Error: Invalid input. Please enter a valid integer.");
                } catch (IllegalArgumentException e) {
                    System.out.println("❌ Error: " + e.getMessage());
                }

            } else {
                System.out.println("❌ Invalid option. Please type 1, 2, or 'end'.");
            }
        }

        System.out.println("\nThank you for using Roman Converter. Goodbye!");
        scanner.close();
    }
}
