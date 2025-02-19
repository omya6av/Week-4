package banktransactionsystem;

public class BankAccount {
    private double balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    public void withdrawal(int amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        } else if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        } else {
            System.out.println("Withdrawal successful, new balance: " + (balance-amount));
        }
    }

}
