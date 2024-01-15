package de.tum.cit.ase;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
    public static void main(String[] args) {
        // Specify the file path where you want to write the output
        String filePath = "C:\\Users\\berks\\IdeaProjects\\itp2324c01e02-practice-ge95daj\\src\\de\\tum\\cit\\ase\\sample.txt";

        try (OutputStream outputStream = new FileOutputStream(filePath)) {
            // Writing a single byte to the output stream
            int byteToWrite = 65; // ASCII code for 'A'
            outputStream.write(byteToWrite);

            // Writing a byte array to the output stream
            byte[] byteArray = "Hello, OutputStream!".getBytes();
            outputStream.write(byteArray);

            // Flushing the output stream (forcing buffered bytes to be written)
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

