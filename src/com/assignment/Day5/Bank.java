package com.assignment.Day5;

public class Bank {

    public static void main(String[] args) {
        double accountBalance;
       AccountDetails accountDetails1= Base.createAccount("Abhishek",'S',5000);
        Base savingsAccount=new SavingsAccount();
        savingsAccount.depositAmount(300,accountDetails1);
        accountBalance=Base.getBalance(accountDetails1);
        System.out.println("Current Balance in account is:: "+accountBalance);
        savingsAccount.depositAmount(1000,accountDetails1);
        accountBalance=Base.getBalance(accountDetails1);
        System.out.println("Current Balance in account is:: "+accountBalance);
        savingsAccount.withdrawAmount(100,accountDetails1);
        accountBalance=Base.getBalance(accountDetails1);
        System.out.println("Current Balance in account is:: "+accountBalance);
        savingsAccount.withdrawAmount(550,accountDetails1);
        accountBalance=Base.getBalance(accountDetails1);
        System.out.println("Current Balance in account is:: "+accountBalance);


        AccountDetails accountDetails2= Base.createAccount("Mohit",'C',5000);
        Base currentAccount=new CurrentAccount();
        currentAccount.depositAmount(800,accountDetails2);
        accountBalance=Base.getBalance(accountDetails2);
        System.out.println("Current Balance in account is:: "+accountBalance);
        currentAccount.depositAmount(1200,accountDetails2);
        accountBalance=Base.getBalance(accountDetails2);
        System.out.println("Current Balance in account is:: "+accountBalance);
        currentAccount.withdrawAmount(700,accountDetails2);
        accountBalance=Base.getBalance(accountDetails2);
        System.out.println("Current Balance in account is:: "+accountBalance);
        currentAccount.withdrawAmount(1500,accountDetails2);
        accountBalance=Base.getBalance(accountDetails2);
        System.out.println("Current Balance in account is:: "+accountBalance);

    }
}
