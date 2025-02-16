package extractionproblems.replaceandmodifystrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceAndModifyStrings {
    public static void main(String[] args) {

        String text = "This    is an     example   with multiple spaces.";

        String newText = text.replaceAll("\\s+", " ");

        System.out.println(newText);

    }
}
