package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius = 0.0;
        String strInput;
        boolean valid = false;
        boolean isPositiveNumber;

        // Set up Scanner
        Scanner input = new Scanner(System.in);

        // Keep looking until valid input
        while (!valid) {
            // Prompt user for a radius
            System.out.println("Enter a radius: ");

            // Grab input from keyboard
            strInput = input.nextLine();

            // Try to convert String into Double
            try {
                radius = Double.parseDouble(strInput);
                isPositiveNumber = validateRadius(radius);

                if (isPositiveNumber) {
                    valid = true;
                    double area = Circle.getArea(radius);
                    System.out.println("The area of a circle of radius " +  radius + " is: " + area);
                }
            } catch(NumberFormatException error) {
                System.out.println("Error - enter a number for radius");
            }
        }
    }

    public static boolean validateRadius(Double radius) {
        if (radius >= 0) {
            return true;
        }

        System.out.println("Error - enter a number greater than or equal to zero.");
        return false;
    }
}
