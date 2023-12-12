package org.launchcode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NewTest {

    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Me");
        planets.add("00");
        planets.add("Mery");
        System.out.println(planets);
        String[] planetArray=new String[planets.size()];
        planets.toArray(planetArray);
        System.out.println(planets);
        for (int i = 0; i < planetArray.length; i++) {
            System.out.println(planetArray[i]);
        }
    }
}
