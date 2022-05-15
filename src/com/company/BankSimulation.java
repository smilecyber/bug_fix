package com.company;

import java.util.Scanner;

public class BankSimulation {
    public static void main(String[] args) {
        System.out.println("Welcome to Cydeo Bank Application");
        System.out.println("Create Account Screen ");
        System.out.println("Please Enter First Account Balance: ");
        Scanner scanner = new Scanner(System.in);
        double account1Balance = scanner.nextDouble();
        System.out.println("Please Enter First Account Holder UserId: ");
        int userId1 = scanner.nextInt();
        System.out.println("Please Enter First Account Type (Checking :1 , Savings:2) : ");
        int account1Type = scanner.nextInt();

        System.out.println("Please Enter Second Account Balance: ");
        double account2Balance = scanner.nextDouble();
        System.out.println("Please Enter Second Account Holder UserId: ");
        int userId2 = scanner.nextInt();
        System.out.println("Please Enter Second Account Type (Checking :1 , Savings:2) : ");
        int account2Type = scanner.nextInt();

        System.out.println("Now you can make transfer!!!");
        System.out.println("Account1 Balance: " + account1Balance);
        System.out.println("Account2 Balance: " + account2Balance);

        System.out.println("Please enter senderId (account1: 1, account2: 2)");
        int senderId = scanner.nextInt();
        System.out.println("Please enter receiverId (account1: 1, account2: 2)");
        int receiverId = scanner.nextInt();
        System.out.println("Please enter transfer amount");
        double amount = scanner.nextDouble();


        if (account1Type == 2 || account2Type ==2){
            if (userId1 != userId2){
                System.out.println("if one of account is checking accounts needs to be belonged same user");
                return;
            }
        }

        if (senderId == 1){
             if (account1Balance < amount){
                 System.out.println("account1 balance is not enough to make transfer");
             }
             account1Balance -= amount;
            account2Balance += amount;

        }else {
            if (account2Balance < amount){
                System.out.println("account2 balance is not enough to make transfer");
            }
            account2Balance -= amount;
            account1Balance += amount;
        }
        System.out.println(account1Balance);
        System.out.println(account2Balance);
    }
}
