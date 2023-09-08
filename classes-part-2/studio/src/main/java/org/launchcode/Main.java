package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MenuItem menuItem1 = new MenuItem("Spaghetti",8.00,"Noodles with Sauce","Main Course", true);
        MenuItem menuItem2 = new MenuItem("Gyoza",2.50,"Pork Filled Dumplings","Appetizer", true);
        MenuItem menuItem3 = new MenuItem("Gyro",9.75,"Pita Pocket like hot pocket but better","Main Course", true);
        MenuItem menuItem4 = new MenuItem("Apple Pie",2.25,"Apple with Pie Crust","Dessert", true);

        Menu menu1 = new Menu(LocalDate.now(), new ArrayList<MenuItem>());

        menu1.addItem(menuItem2);
        menu1.addItem(menuItem1);
        menu1.addItem(menuItem3);
        menu1.addItem(menuItem4);

        menu1.getItems();

        menu1.getItem();

        menu1.removeItem(menuItem4);

        menu1.getItems();

        MenuItem menuItem5 = new MenuItem("Gyro",9.75,"Pita Pocket like hot pocket but better","Main Course", true);

        menu1.addItem(menuItem5);

        menu1.getItems();
    }
}
