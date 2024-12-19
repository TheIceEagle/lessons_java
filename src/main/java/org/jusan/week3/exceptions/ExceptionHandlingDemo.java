package org.jusan.week3.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingDemo {
    public static void readFile() {
        FileReader reader = null;
        try {
            // Code that might throw an exception
            reader = new FileReader("data.txt");
            int character = reader.read();
            System.out.println("File content: " + character);
        } catch (FileNotFoundException e) {
            // Handle the specific exception
            System.out.println("Error: File not found - " + e.getMessage());
        } catch (IOException e) {
            // Handle more general IO exceptions
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            // Cleanup code - always executed
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}
