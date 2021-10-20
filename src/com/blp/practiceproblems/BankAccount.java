package com.blp.practiceproblems;

/**
 * Print Bank Details
 */
public class BankAccount {

    public static void main(String[] args) {
        String bankName = "Bank of India";
        System.out.println("Bank Name = " +bankName);
        //Creat object to store the details
        BankAccount account = new BankAccount();
        //Call method to print details
        account.display(16785433l, "Dhanashree", 23);
    }
    public void display( long accountNumber, String accountHolderName, int age) {
        System.out.println("Account number = " +accountNumber);
        System.out.println("Account holder name = " +accountHolderName);
        System.out.println("Account Holder age = " +age);
    }

}

