package de.tum.cit.ase;

import java.io.*;

public class ReaderExample {
    public static void main(String[] args) {
        // Specify the file path to read from
        String filePath = "C:\\Users\\berks\\IdeaProjects\\itp2324c01e02-practice-ge95daj\\src\\de\\tum\\cit\\ase\\sample.txt";

        try (Reader reader = new FileReader(filePath)) {
            // Check if the reader is ready
            if (reader.ready()) {
                System.out.println("Reader is ready to read.");
            }

            // Read characters from the reader
            int charCode;
            while ((charCode = reader.read()) != -1) {
                char character = (char) charCode;
                System.out.print(character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }




        String fileName = "C:\\Users\\berks\\IdeaProjects\\itp2324c01e02-practice-ge95daj\\src\\de\\tum\\cit\\ase\\sample.txt";

        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream)) {

            int charCode;
            while ((charCode = inputStreamReader.read()) != -1) {
                char character = (char) charCode;
                System.out.print(character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

