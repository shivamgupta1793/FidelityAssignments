package com.assignment.Day4.SalaryCalc;

public class SalaryCalculator {

    private static  SalaryInputs salaryInputs;

    public double calculateSalary()
    {
        double basicSalary= salaryInputs.getBasicSalary();
        double hra=salaryInputs.getHra();
        double da=salaryInputs.getDa();
        double taxper=salaryInputs.getTaxPer();
        double grossSalary=basicSalary+hra+da;
      double taxValue= taxDeductionCalc(grossSalary,taxper);
      double netSalary=grossSalary-taxValue;
      return netSalary;
    }


    public double taxDeductionCalc(double netSalary,double taxper)
    {   double taxValue= ((taxper/100)*netSalary);
        System.out.println("TotalTaxValue:: "+taxValue);
        return taxValue;
    }


    public static void main(String[] args) {
        salaryInputs=new SalaryInputs(800000,40000,20000,5);
        SalaryCalculator salaryCalculator=new SalaryCalculator();

        double netSalary=salaryCalculator.calculateSalary();
        System.out.println("SalaryOutput:: "+netSalary);

    }
}
