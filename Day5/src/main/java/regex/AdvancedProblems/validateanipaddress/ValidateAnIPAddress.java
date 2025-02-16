package AdvancedProblems.validateanipaddress;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAnIPAddress {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the IP address :");
        String ipAddress = input.nextLine();

        String regex = "^(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(ipAddress);

        if (matcher.matches()) {
            System.out.println("Valid IP address");
        } else {
            System.out.println("Invalid IP address");
        }


    }
}
