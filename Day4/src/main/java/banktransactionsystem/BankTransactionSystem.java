package banktransactionsystem;

import java.util.Scanner;

public class BankTransactionSystem {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        System.out.println("Enter the withdrawal amount ");
        int amount = input.nextInt();

        try{
            BankAccount customer = new BankAccount(10000);
            customer.withdrawal(amount);
        }catch (IllegalArgumentException | InsufficientBalanceException e){
            System.out.println(e);
        }
    }
}
