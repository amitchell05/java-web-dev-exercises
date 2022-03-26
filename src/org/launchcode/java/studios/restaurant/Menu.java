package org.launchcode.java.studios.restaurant;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    public static void main(String[] args) throws ParseException {
        ArrayList<MenuItem> menuItems = new ArrayList<>();

        LocalDate today = LocalDate.now();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Date dateOne = dateFormat.parse("15-11-2021");
        Date dateTwo = dateFormat.parse("21-1-2022");
        Date dateThree = dateFormat.parse("26-03-2022");

        MenuItem menuItem1 = new MenuItem(11.15, "nacho chips bowl", "appetizer", dateOne);
        MenuItem menuItem2 = new MenuItem(15, "parmesan crusted chicken", "main course", dateTwo);
        MenuItem menuItem3 = new MenuItem(8.25, "oreo blizzard", "dessert", dateThree);

        menuItems.add(menuItem1);
        menuItems.add(menuItem2);
        menuItems.add(menuItem3);

        for (MenuItem menuItem : menuItems) {
            LocalDate menuItemDate = menuItem.getDateAdded().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            if (menuItemDate.isEqual(today)) {
                System.out.println("New Item: " + menuItem.getDescription());
            } else {
                System.out.println("Original Menu Item: " + menuItem.getDescription());
            }
        }
    }
}
