package AdvancedProblems.findrepeatingwords;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatingWords {
    public static void main(String[] args) {

        String text = "This is is a repeated repeated word test.";
        String regex = "\\b(\\w+)\\b(?:\\s+\\b\\1\\b)+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
