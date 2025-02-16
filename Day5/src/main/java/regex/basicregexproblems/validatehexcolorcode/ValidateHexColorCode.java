package basicregexproblems.validatehexcolorcode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHexColorCode {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Hex Color Code :");
        String hexColor = input.nextLine();

        String regex = "^#[0-9A-Fa-f]{6}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(hexColor);

        if(matcher.matches()){
            System.out.println("Valid Hex Color Code");
        }else{
            System.out.println("Invalid Hex Color Code");
        }

    }
}
