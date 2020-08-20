package com.assignment.Day4;

public class Bank {

    public String bankName;
    public int bankBranchCode;
    public int numberOfEmployee;

    public String getBankName(String bankName) {
        this.bankName=bankName;
        System.out.println("BANKNAME ::"+bankName);
        return bankName;
    }

    public int getBankBranchCode(int bankBranchCode) {
        this.bankBranchCode=bankBranchCode;
        System.out.println("BankBranchCode:: "+bankBranchCode);
        return bankBranchCode;
    }

    public int getNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee=numberOfEmployee;
        System.out.println("NumberOfEmployee"+numberOfEmployee);
        return numberOfEmployee;
    }




}
