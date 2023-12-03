package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        // You can create an ArrayList and call the sumEvent method here for testing
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Call the sumEven method on the list
        int evenSum = sumEven(numbers);
        System.out.println("Sum of even numbers: " + evenSum);

        // Prompt the user to enter the word length
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        // Create a list of words from the string
        String sentence = "This is a sample sentence with words of different lengths";
        ArrayList<String> words = convertStringToArrayList(sentence);

        // Call the printWordsWithLength method on the list and user-provided length
        printWordsWithLength(words, numChars);
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void printWordsWithLength(ArrayList<String> words, int length) {
        for (String word : words) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }

    // Method to convert a string to an ArrayList of words
    public static ArrayList<String> convertStringToArrayList(String sentence) {
        String[] wordsArray = sentence.split("\\s+");
        ArrayList<String> wordsList = new ArrayList<>();
        for (String word : wordsArray) {
            wordsList.add(word);
        }
        return wordsList;
    }
}