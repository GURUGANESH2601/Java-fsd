package project10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";

        // match a pattern using a regular expression
        Pattern pattern = Pattern.compile("[aeiou]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Match found at index " + matcher.start());
        }
        
        // replace a pattern using a regular expression
        String newText = text.replaceAll("\\bthe\\b", "THE");
        System.out.println("Original text: " + text);
        System.out.println("New text: " + newText);
    }
}
