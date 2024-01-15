package de.tum.cit.ase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        // Compile a regex pattern for matching email addresses
        Pattern emailPattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");

        // Email address pattern explanation:
        // [a-zA-Z0-9._%+-\.]+    : Match one or more occurrences of letters, digits, dots, underscores, percent signs, plus signs, or hyphens.
        // @                    : Match the at symbol.
        // [a-zA-Z0-9.-]+       : Match one or more occurrences of letters, digits, dots, or hyphens.
        // \.                   : Match a literal dot. The backslash (\) is used to escape the dot.
        // [a-zA-Z]{2,}         : Match at least two occurrences of letters.

        // Input text containing email addresses
        String inputText = "Contact us at john.doe@example.com or support@example.org for assistance.";

        // Create a Matcher object for the input text
        Matcher matcher = emailPattern.matcher(inputText);

        // Find and print all email addresses in the input text
        while (matcher.find()) {
            System.out.println("Found email: " + matcher.group());
        }
    }
}

/* If you need to check for a pattern within a larger string rather than the entire string, a Matcher
can be used with the find method. This allows you to find partial matches at different positions
in the string. If you want to find multiple occurrences of a pattern in a string, you can use a Matcher
in a loop with the find method. This is useful for extracting or processing each occurrence individually.
If your regular expression contains capturing groups, you can use a Matcher to extract specific parts
of the matched content using the group method.
 */
