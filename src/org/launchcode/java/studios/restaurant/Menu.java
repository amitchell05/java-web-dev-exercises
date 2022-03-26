package org.launchcode.java.studios.restaurant;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class Menu  {
    static ArrayList<MenuItem> menuItems = new ArrayList<>();
    static LocalDate today = LocalDate.now();
    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public static void main(String[] args) throws ParseException {
        Date dateOne = dateFormat.parse("15-11-2021");
        Date dateTwo = dateFormat.parse("21-1-2022");
        Date dateThree = dateFormat.parse("26-03-2022");

        MenuItem menuItem1 = new MenuItem(11.15, "nacho chips bowl", "appetizer", dateOne);
        MenuItem menuItem2 = new MenuItem(15, "parmesan crusted chicken", "main course", dateTwo);
        MenuItem menuItem3 = new MenuItem(8.25, "oreo blizzard", "dessert", dateThree);

        addMenuItem(menuItem1);
        addMenuItem(menuItem2);
        addMenuItem(menuItem3);

//        printMenu(menuItems);
        printMenuItem(menuItem1);

//        removeMenuItem(menuItems.indexOf(menuItem2));

//        isNewMenuItem(menuItem1);
//        isNewMenuItem(menuItem2);
//        isNewMenuItem(menuItem3);
    }

    private static void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    private static void removeMenuItem(int itemIndex) {
        menuItems.remove(itemIndex);
    }

    private static boolean isNewMenuItem(MenuItem menuItem) {
        LocalDate menuItemDate = menuItem.getDateAdded().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return menuItemDate.isEqual(today);
    }

    private static void printMenuItem(MenuItem menuItem) {
        System.out.println(menuItem.getDescription());
    }

    private static void printMenu(ArrayList<MenuItem> menu) {
        // TODO: Loop through menu and print out menu item names?
    }
}
