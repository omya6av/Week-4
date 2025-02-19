package throwvsthrows;

import java.util.Scanner;

public class ThrowVsThrows {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Amount : ");
            double amount =  input.nextDouble();
        System.out.println("Enter the rate : ");
            double rate = input.nextDouble();
        System.out.println("Enter the years : ");
            int years  = input.nextInt();

       try {
           System.out.println(calculateInterest(amount,rate,years));
       }catch (IllegalArgumentException e){
           System.out.println("Invalid input: Amount and rate must be positive");
       }
    }

    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException{
        if(amount < 0 || rate < 0){
            throw new IllegalArgumentException();
        }
        return ((amount*rate*years )/ 100 );
    }
}
