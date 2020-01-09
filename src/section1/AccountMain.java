package section1;

import java.util.Scanner;

public class AccountMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Account Number");
        String accountNumber = sc.nextLine();
        System.out.println("Enter the Account Balance ");
        int balance = sc.nextInt();
        System.out.println("Enter 1 to deposit an amount, 2 to withdraw an amount  ");
        int n = sc.nextInt();
        Account a = new Account(accountNumber, balance);
        if (n == 1) {
            System.out.println("Enter the amount to deposit");
            int transactionAmount = sc.nextInt();
            a.deposit(transactionAmount);

        }
        if (n == 2) {
            System.out.println("Enter the amount to withdraw");
            int transactionAmount = sc.nextInt();
            a.withdraw(transactionAmount);

        }

        sc.close();
    }
}