package org.launchcode.java.studios.restaurant;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Menu {

    public static void main(String[] args) throws ParseException {
        ArrayList<MenuItem> menuItems = new ArrayList<>();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Date dateOne = dateFormat.parse("15-11-2021");
        Date dateTwo = dateFormat.parse("21-1-2022");
        Date dateThree = dateFormat.parse("23-03-2022");

        MenuItem menuItem1 = new MenuItem(11.15, "nacho chips bowl", "appetizer", dateOne);
        MenuItem menuItem2 = new MenuItem(15, "parmesan crusted chicken", "main course", dateTwo);
        MenuItem menuItem3 = new MenuItem(8.25, "oreo blizzard", "dessert", dateThree);

        menuItems.add(menuItem1);
        menuItems.add(menuItem2);
        menuItems.add(menuItem3);

        for (MenuItem menuItem : menuItems) {
            System.out.println(menuItem.getDescription());
        }
    }
}
