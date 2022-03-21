package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = 0.0;
        String radiusAsString;
        boolean valid = false;

        do {
            System.out.print("Enter a radius: ");
            radiusAsString = input.nextLine();

            if (radiusAsString.isEmpty()) {
                System.out.println("Please enter a radius.");
            } else {
                try {
                    radius = Double.parseDouble(radiusAsString);
                    if (radius < 0) {
                        System.out.println("Please enter a radius greater than or equal to zero.");
                    } else {
                        valid = true;
                    }
                } catch(NumberFormatException error) {
                    System.out.println("Please enter a number for radius");
                }
            }
        } while (!valid);

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " +  radius + " is: " + area);

        input.close();
    }
}
