package org.example;

import java.util.Arrays; // Import the Arrays class


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ArrayPractice {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for(int i: integerArray){
            System.out.println(i);
        }
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        //method1
        System.out.println(Arrays.toString(words));
        //method2
        for (String word : words) {
            System.out.println(word);
        }

        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }


}