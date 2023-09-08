package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(LocalDate d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public void addItem(MenuItem menuItem) {
        boolean itemExists = false;

        for (MenuItem menuItem1 : this.items) {
            if (menuItem1.equals(menuItem)) {
                System.out.print("That item is already on the menu.\n\n");
                itemExists = true;
            }
        }
        if (!itemExists) {
            this.items.add(menuItem);
        }
    }

    public void removeItem(MenuItem menuItem) {
        this.items.remove(menuItem);
    }

    public LocalDate getLastUpdated() {
        return this.lastUpdated;
    }

    public void getItems() {
        System.out.print("Menu:\n");
        for (MenuItem menuItem : this.items) {
            System.out.print(menuItem.toString());
        }
    }

    public void getItem() {
        int itemIdx = 2;
        int currentIdx = 0;
        for (MenuItem menuItem : this.items) {
            if (itemIdx == currentIdx) {
                System.out.print(menuItem.toString());
                currentIdx++;
            } else {
                currentIdx++;
            }
        }
    }
}