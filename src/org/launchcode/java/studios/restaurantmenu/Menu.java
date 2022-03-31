package org.launchcode.java.studios.restaurantmenu;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private LocalDate dateUpdated;
    private ArrayList<MenuItem> menuItems;

    public Menu(LocalDate dateUpdated, ArrayList<MenuItem> menuItems) {
        this.dateUpdated = dateUpdated;
        this.menuItems = menuItems;
    }

    public LocalDate getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(LocalDate dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public ArrayList<MenuItem> addMenuItem(MenuItem menuItem) {
        this.menuItems.add(menuItem);
        return this.menuItems;
    }

    public ArrayList<MenuItem> removeMenuItem(MenuItem menuItem) {
        menuItems.remove(menuItem);
        return this.menuItems;
    }

    public void menuUpdated() {
        System.out.println("This menu was updated on: " + this.dateUpdated);
    }

    public void printMenuItem(MenuItem menuItem) {
        System.out.println(menuItem.getDescription());
    }

    public void printMenu() {
        System.out.println("*****");
        for (MenuItem item : this.menuItems) {
            System.out.printf("%s: $%s\n", item.getDescription(), item.getPrice());
            System.out.print("*****\n");
        }
    }
}
