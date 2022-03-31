package org.launchcode.java.studios.restaurantmenu;

import java.time.LocalDate;
import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args) {
        // Declare and initialize an empty menu
        ArrayList<MenuItem> startingMenu = new ArrayList<>();

        // Create menu items
        MenuItem menuItem1 = new MenuItem(11.15, "nacho chips bowl", "appetizer");
        MenuItem menuItem2 = new MenuItem(15, "parmesan crusted chicken", "main course");
        MenuItem menuItem3 = new MenuItem(8.25, "oreo blizzard", "dessert");

        // Create menu
        Menu ourMenu = new Menu(LocalDate.now(), startingMenu);

        // Add items to a menu.
        ourMenu.addMenuItem(menuItem1);
        ourMenu.addMenuItem(menuItem2);
        ourMenu.addMenuItem(menuItem3);

        // Print the entire, updated menu
        ourMenu.printMenu();

        // Print an individual menu item to the screen.
        ourMenu.printMenuItem(menuItem1);

        // Delete an item from a menu
        ourMenu.removeMenuItem(menuItem2);

        // Print whether a menu item is new or not
        System.out.println(menuItem1.isNewMenuItem());

        // Print when the menu was last updated
        ourMenu.menuUpdated();

        // Reprint the menu
        ourMenu.printMenu();
    }
}
