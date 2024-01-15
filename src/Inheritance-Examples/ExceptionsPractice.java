package de.tum.cit.ase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsPractice {
    /*  If a method is capable of throwing a checked exception (a subclass of Exception, excluding RuntimeException and its subclasses),
        you should declare it using the throws clause in the method signature.
        The caller of the method is then required to either handle the exception using a try-catch block or declare the exception
         in its own throws clause.
     */

    // Method with throws clause indicating it might throw a checked exception
    public static void readFile(String filename) throws FileNotFoundException {
        // Code that might throw FileNotFoundException
        throw new FileNotFoundException("File not found: " + filename);
    }

    public static void readEvery() {
        try {
            readFile("nonexisting.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Exception found: " + e);
        }
    }

    public static void readFile2(String filename) {

        try {
            // Code that might throw FileNotFoundException
            throw new FileNotFoundException("File not found: " + filename);
            // ... (other code that may throw IOException, etc.)
        } catch (FileNotFoundException e) {
            // Handling the exception locally
            System.out.println("FileNotFoundException caught: " + e.getMessage());
            // You can also perform other actions, log, etc.
        } finally {
            // Code in the finally block will be executed regardless of whether an exception occurred or not
            System.out.println("This is the finally block.");
        }
    }






    /*You are not required to declare unchecked exceptions (subclasses of RuntimeException) in the throws clause.
    It is generally not recommended to declare unchecked exceptions in the throws clause, as it may mislead the caller?

     */
    public static void printLength(String str) {
        // Code that might throw NullPointerException
        throw new NullPointerException();
    }

    public static void doSth() {
        printLength(null);
    }







    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};
        try {
            // Code that might throw an unchecked exception (ArrayIndexOutOfBoundsException)
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the unchecked exception
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block.");
        }



        try {
            // Code that might throw a checked exception
            FileReader fileReader = new FileReader("nonexistentfile.txt");
        } catch (IOException e) {
            // Handling the checked exception
            System.out.println("IOException caught: " + e.getMessage());
        } finally {
            // Code in the finally block will be executed regardless of whether an exception occurred or not
            System.out.println("This is the finally block.");
        }




        try {
            readFile("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            // Handling the checked exception
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        }



        try {
            String nullString = null;
            printLength(nullString);
        } catch (NullPointerException e) {
            // Handling the NullPointerException
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }




}
