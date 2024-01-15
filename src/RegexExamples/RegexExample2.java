package de.tum.cit.ase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d{3}-\\d{2}-\\d{4}"); // Social Security Number pattern
        // Social Security Number pattern explanation:
        // \d{3}  : Match exactly three digits.
        // -      : Match a hyphen.
        // \d{2}  : Match exactly two digits.
        // -      : Match another hyphen.
        // \d{4}  : Match exactly four digits.


        String input = "123-45-6789";

        if (pattern.matcher(input).matches()) {
            System.out.println("Valid Social Security Number");
        } else {
            System.out.println("Invalid Social Security Number");
        }

        Pattern pattern2 = Pattern.compile("\\b\\d+\\b"); // Match whole numbers
        String t = "42 is greater than 10 and 100 is greater than 50";

        Matcher matcher = pattern2.matcher(t);

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }

        String input2 = "12345";
        if (input2.matches("\\d{5}")) {
            System.out.println("Valid ZIP code");
        } else {
            System.out.println("Invalid ZIP code");
        }

        String text = "Hello, world!";
        String replaced = text.replace("world", "Java");
        System.out.println(replaced);  // Output: Hello, Java!

        String text2 = "apple apple orange apple";
        String replaced2 = text2.replaceAll("apple", "banana");
        System.out.println(replaced2);  // Output: banana banana orange banana

        String sentence = "The'quick'brown fox jumps over the lazy dog";
        String[] words = sentence.split("\'");  // Split by one or more whitespace characters
        for (String word : words) {
            System.out.println(word);
        }

    }
}
