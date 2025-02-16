package basicregexproblems.validatelicenseplatenumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicensePlateNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a License Plate Number :");
        String plateNumber = input.nextLine();

        String regex = "^[A-Z]{2}\\d{4}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(plateNumber);

        if(matcher.matches()){
            System.out.println("Valid  License Plate Number");
        }else{
            System.out.println("Invalid  License Plate Number!");
        }

    }
}
