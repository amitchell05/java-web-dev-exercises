package org.launchcode.java.studios.restaurantmenu;

import java.time.LocalDate;
import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args) {
        ArrayList<MenuItem> startingMenu = new ArrayList<>();

        MenuItem menuItem1 = new MenuItem(11.15, "nacho chips bowl", "appetizer");
        MenuItem menuItem2 = new MenuItem(15, "parmesan crusted chicken", "main course");
        MenuItem menuItem3 = new MenuItem(8.25, "oreo blizzard", "dessert");

        Menu ourMenu = new Menu(LocalDate.now(), startingMenu);

        ourMenu.addMenuItem(menuItem1);
        ourMenu.addMenuItem(menuItem2);
        ourMenu.addMenuItem(menuItem3);

//        ourMenu.menuUpdated();
//
//        ourMenu.printMenuItem(menuItem1);
//
//        ourMenu.removeMenuItem(menuItem2);
//
//        menuItem1.isNewMenuItem();
//        menuItem3.isNewMenuItem();
//
//        ourMenu.menuUpdated();

        ourMenu.printMenu();
    }
}
