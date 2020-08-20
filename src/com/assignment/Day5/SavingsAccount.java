package com.assignment.Day5;

public class SavingsAccount extends Base{

    @Override
    public float rateofInterest() {
        return 7.2f;
    }

    @Override
    public void depositAmount(double amountToDeposit,AccountDetails accountDetails) {
        if(amountToDeposit<500)
        {
            System.out.println("Minimum Amount Deposit Limit is 500");
        }
        else{
            double currentBalance=accountDetails.getAccountBalance();
            double updatedBalance=currentBalance+amountToDeposit;
            accountDetails.setAccountBalance(updatedBalance);
            System.out.println("Amount of Rs "+amountToDeposit+"  has been Deposited in Savings Account:: "+accountDetails.getAccountNumber()+ " Successfully updated balance is "+updatedBalance);
        }
    }

    @Override
    public void withdrawAmount(double amountToWithdraw,AccountDetails accountDetails) {
        if(amountToWithdraw<500)
        {
            System.out.println("Minimum Amount Withdraw Limit for Savings Account is 500");
        }
        else{
            double currentBalance=accountDetails.getAccountBalance();
            double updatedBalance=currentBalance-amountToWithdraw;
            accountDetails.setAccountBalance(updatedBalance);
            System.out.println("Amount of Rs "+amountToWithdraw+" has been withdrawn from your Savings Account:: "+accountDetails.getAccountNumber()+ "  Successfully updated balance is "+updatedBalance);
        }
    }
}
