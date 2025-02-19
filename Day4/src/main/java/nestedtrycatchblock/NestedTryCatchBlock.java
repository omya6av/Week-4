package nestedtrycatchblock;

import java.util.Scanner;

public class NestedTryCatchBlock {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int size = input.nextInt();
        System.out.println("Enter the elements : ");
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Enter a divisor : ");
        int divisor = input.nextInt();

        System.out.println("Enter a index of element ");
        int index = input.nextInt();

        try {
            int check = array[index];
            try {
                System.out.println(array[index] / divisor);
            } catch (ArithmeticException e) {
                System.out.println(e);
                System.out.println("Cannot divide by zero!");

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }

    }
}
