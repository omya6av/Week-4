package multiplecatchblocks;

import java.util.Scanner;

public class MultipleCatchBlocks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int size = input.nextInt();
        System.out.println("Enter the elements : " );
        int[] array = new int[size];

        for(int i=0; i<size; i++){
            array[i] = input.nextInt();
        }

        try{
            System.out.println("Enter the index Number : " );
            int index = input.nextInt();
            System.out.println("Number of this index : "+ index + " is : "+ array[index]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index!");
        }catch (NullPointerException e){
            System.out.println("Array is not initialized!");
        }


    }
}
