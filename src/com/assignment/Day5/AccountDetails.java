package com.assignment.Day5;

public class AccountDetails {

    protected String name;
    protected char accountType;
    protected  long accountNumber;
    protected  double accountBalance;
    public AccountDetails(String name, char accountType,long accountNumber,double accountBalance) {
        this.name = name;
        this.accountType = accountType;
        this.accountNumber=accountNumber;
        this.accountBalance=accountBalance;

    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public char getAccountType() {
        return accountType;
    }

}
