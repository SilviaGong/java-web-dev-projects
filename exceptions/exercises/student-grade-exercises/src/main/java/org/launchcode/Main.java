package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        Divide(8, 2);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (String student : studentFiles.keySet()) {
            int points = CheckFileExtension(studentFiles.get(student));
            System.out.println(student + ": " + points + " points");
        }

    }

    public static void Divide(int x, int y) {
        // Write code here!
        if (y == 0) {
            try {
                throw new ArithmeticException("y should not equal 0");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        int value = x / y;
        System.out.println("Result: " + value);

    }

    public static int CheckFileExtension(String fileName) {
        // Write code here!
        if (fileName == null || fileName.isEmpty()) {
            try {
                throw new ArithmeticException("File name is null or empty");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        if (fileName.endsWith(".java")) {
            return 1; // 1 point for .java file
        } else {
            return 0; // 0 points for other file types
        }
    }
}