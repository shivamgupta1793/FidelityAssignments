package com.assignment.Day5;

public class CurrentAccount extends Base {

    @Override
    public float  rateofInterest() {
        return 3.5f;
    }

    @Override
    public void depositAmount(double amountToDeposit,AccountDetails accountDetails) {
        if(amountToDeposit<1000)
        {
            System.out.println("Minimum Amount Deposit Limit for Current Account is 1000");
        }
        else{
            double currentBalance=accountDetails.getAccountBalance();
            double updatedBalance=currentBalance+amountToDeposit;
            accountDetails.setAccountBalance(updatedBalance);
            System.out.println("Amount of Rs "+amountToDeposit+"  has been Deposited in Current Account:: "+accountDetails.getAccountNumber()+ " Successfully updated balance is "+updatedBalance);
        }

    }

    @Override
    public void withdrawAmount(double amountToWithdraw,AccountDetails accountDetails) {
        if(amountToWithdraw<1000)
        {
            System.out.println("Minimum Amount Withdraw Limit is 1000");
        }
        else{
            double currentBalance=accountDetails.getAccountBalance();
            double updatedBalance=currentBalance-amountToWithdraw;
            accountDetails.setAccountBalance(updatedBalance);
            System.out.println("Amount of Rs "+amountToWithdraw+" has been withdrawn from your Current Account:: "+accountDetails.getAccountNumber()+ "  Successfully updated balance is "+updatedBalance);

        }
    }
}
