package org.launchcode.java.studios.restaurant;

import java.util.Date;

public class MenuItem {

    private double price;
    private String description;
    private String category;
    private Date dateAdded;

    public MenuItem(double price, String description, String category, Date dateAdded) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = dateAdded;
    }

    public double getPrice() {
        return price;
    };

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setPrice(double aPrice) {
        price = aPrice;
    }

    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public void setCategory(String aCategory) {
        category = aCategory;
    }

    public void setDateAdded(Date aDateAdded) {
        dateAdded = aDateAdded;
    }
};

