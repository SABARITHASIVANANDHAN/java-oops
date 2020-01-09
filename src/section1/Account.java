package section1;

public class Account {
    private String accountNumber;
    private int balance;

    public Account(String accountNumber, int balance) {
        super();
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int transactionAmount) {
        this.balance = this.balance + transactionAmount;
        System.out.println("Your balance after the transaction is:" + this.balance);

    }

    public void withdraw(int transactionAmount) {
        this.balance = this.balance - transactionAmount;
        if (this.balance <= 0) {
            System.out.println("Insufficient balance");
            this.balance = this.balance + transactionAmount;
            System.out.println("Your balance after the transaction is:" + this.balance);
        } else {
            System.out.println("Your balance after the transaction is:" + this.balance);
        }

    }
}
