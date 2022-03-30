package org.launchcode.java.studios.restaurantmenu;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class MenuItem {

    private double price;
    private String description;
    private String category;
    private Date dateAdded;
    private boolean isNew;

    public MenuItem(double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = new Date();
        this.isNew = this.isNewMenuItem();
    }

    public double getPrice() {
        return price;
    };

    public void setPrice(double aPrice) {
        price = aPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String aCategory) {
        category = aCategory;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date aDateAdded) {
        dateAdded = aDateAdded;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(boolean aIsNew) {
        isNew = aIsNew;
    }

    public boolean isNewMenuItem() {
        LocalDate today = LocalDate.now();
        LocalDate menuItemDate = this.dateAdded.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return menuItemDate.isEqual(today);
    }
};

