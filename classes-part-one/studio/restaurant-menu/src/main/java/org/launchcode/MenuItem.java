package org.launchcode;

public class MenuItem {
    private String name;
    private String description;
    private String category;
    private double price;
    private boolean isNew;

    public MenuItem(String name, String description, String category, double price, boolean isNew) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.isNew = isNew;
    }
    public MenuItem(String name, String description, String category, double price) {
        this(name, description, category, price, true);
    }
    public MenuItem(String name, String description, String category) {
        this(name, description, category, 0.00);
    }
    public MenuItem(String name, String description) {
        this(name, description, "No Category.");
    }
    public MenuItem(String name) {
        this(name, "No Description.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
