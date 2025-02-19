package finallyblockexecution;

import java.util.Scanner;

public class FinallyBlockExecution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int num1 = input.nextInt();

        System.out.println("Enter 2st number : ");
        int num2 = input.nextInt();

        try {
            int division = num1 / num2;
            System.out.println("division of 2 number is : " + division);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Operation completed");
        }

    }
}
