package customexception;

import java.util.Scanner;

public class CustomException {

    public static void validateAge(int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above");
            } else {
                System.out.println("Access granted!");
            }

    }
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        try{
            System.out.println("Enter the age : ");
            int age = input.nextInt();
            validateAge(age);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }

    }
}
