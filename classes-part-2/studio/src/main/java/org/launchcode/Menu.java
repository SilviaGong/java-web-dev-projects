package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    // Method to add a menu item to the menu
    public void addMenuItem(MenuItem newItem) {
        items.add(newItem);
        setLastUpdated(new Date()); // Update the lastUpdated date
    }

    // Method to remove a menu item from the menu
//    public void removeMenuItem(MenuItem itemToRemove) {
//        items.remove(itemToRemove);
//        setLastUpdated(new Date()); // Update the lastUpdated date
//    }

    // Method to print a single menu item
    public void printMenuItem(MenuItem item) {
        item.printItem(); // Assuming MenuItem has a printItem method
    }

    // Method to print the entire menu
    public void printMenu() {
        for (MenuItem item : items) {
            printMenuItem(item);
        }
    }
}


