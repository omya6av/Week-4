package uncheckedexception;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;

public class UncheckedException {

    public static void main(String[] args) {
        String fileName = "data.txt";

        try {

            Scanner reader = new Scanner(System.in);
            System.out.println("Enter 1st number : ");
            int num1 = reader.nextInt();

            System.out.println("Enter 2st number : ");
            int num2 = reader.nextInt();

            System.out.println(num1 / num2);

        } catch (ArithmeticException e) {
            System.out.println("Division by 0 is not possible");
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid integer");
        }
    }
}
