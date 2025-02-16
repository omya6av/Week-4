package basicregexproblems.validateusernames;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a user Name :");
        String userName = input.nextLine();

        String regex = "^[a-zA-Z]\\w{4,14}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(userName);

     if(matcher.matches()){
         System.out.println("Valid User Name");
     }else{
         System.out.println("Invalid user Name");
     }


    }
}
