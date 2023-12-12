package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem item1 = new MenuItem(10.99, "Delicious Dish 1", "Main Course", true);
        MenuItem item2 = new MenuItem(5.99, "Tasty Appetizer", "Appetizer", false);

        // Create a menu and set the last updated date
        Date currentDate = new Date();
        Menu menu = new Menu(currentDate, new ArrayList<>());

        // Add items to the menu
        menu.addMenuItem(item1);
        menu.addMenuItem(item2);

        // Print the entire menu
        System.out.println("Menu:"+ "\n" + "*****");
        System.out.println("Updated On: "+currentDate);
        menu.printMenu();
        System.out.println("*****");

    }
}

