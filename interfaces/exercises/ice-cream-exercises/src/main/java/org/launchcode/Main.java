package org.launchcode;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        System.out.println("Before:");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        FlavorComparator flavorComparator = new FlavorComparator();
        flavors.sort(flavorComparator);
        System.out.println("\nAfter:");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        System.out.println("\nBefore:");
        for (Cone cone:cones) {
            System.out.println(cone.getName()+":"+cone.getCost());
        }
        ConeComparator coneComparator = new ConeComparator();
        cones.sort(coneComparator);

        System.out.println("\nAfter:");
        for (Cone cone:cones) {
            System.out.println(cone.getName()+":"+cone.getCost());
        }
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}