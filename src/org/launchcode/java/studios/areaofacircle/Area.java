package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        Double radius = input.nextDouble();

        boolean isValidRadius = validateRadius(radius);

        if (isValidRadius) {
            double area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " +  radius + " is: " + area);
        }
    }

    static boolean validateRadius(Double radius) {
        if (radius < 0) {
            System.out.println("Please enter a radius that is greater than or equal to 0.");
            return false;
        } else {
            return true;
        }
    }
}
