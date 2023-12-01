package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
//        double A;
        double r;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        r = input.nextDouble();
        input.close();

//        A = 3.14 * r * r;
//        System.out.println("The area of a circle of radius " + r + " is: " + A + "\n");

        Double circle= Circle.getArea(r);
        System.out.println("The area of a circle of radius " + r + " is: " + circle + "\n");
    }
}
