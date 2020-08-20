package com.assignment.Day5;

import java.util.Random;

public abstract class Base {

    public static AccountDetails createAccount(String name,char accountType,double initialAmount)
    { Random random=new Random();
        long accountNumber= random.nextLong();
        AccountDetails accountDetails=new AccountDetails(name,accountType,accountNumber,initialAmount);
        if(accountType=='S') {
            System.out.println("Savings Account Created Succesfully::  " + accountNumber);
        }
        if(accountType=='C') {
            System.out.println("Current Account Created Succesfully::  " + accountNumber);
        }
        else
        {
            System.out.println("Please specify either 'C' OR 'S' as account type ");
        }

        return accountDetails;
    }
    public static double getBalance(AccountDetails accountDetails) {
        return accountDetails.getAccountBalance();
    }


    public abstract float rateofInterest();
    public abstract void depositAmount(double amountToDeposit,AccountDetails accountDetails);
    public abstract void withdrawAmount(double amountToWithdraw,AccountDetails accountDetails);

}
