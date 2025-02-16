package AdvancedProblems.validateacreditcardnumber;

import javax.swing.text.MaskFormatter;
import java.awt.font.MultipleMaster;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCardNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Credit Card Number : ");
        String creditCardNumber = input.nextLine();

        String regex = "^(4\\d{15}|5\\d{15})$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(creditCardNumber);

        if (matcher.matches()) {
            System.out.println("Valid credit card number");
        } else {
            System.out.println("Invalid credit card number");
        }

    }

}
