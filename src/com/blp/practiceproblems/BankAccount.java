package com.blp.practiceproblems;

/**
 * Print Bank Details
 */
public class BankAccount {

    public static void main(String[] args) {
        //Creat object to store the details
        BankAccount account = new BankAccount();
        //Call method to print details
        account.display();
    }
    private void display() {
        String bankName = "Bank of India";
        long accountNumber = 12345645l;
        String accountHolderName = "Dhanashree Sambhaji Hakke";
        int age = 23;
        System.out.println(bankName);
        System.out.println(accountNumber);
        System.out.println(accountHolderName);
        System.out.println(age);
    }

}

