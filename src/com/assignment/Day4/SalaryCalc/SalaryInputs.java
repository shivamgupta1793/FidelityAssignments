package com.assignment.Day4.SalaryCalc;

public class SalaryInputs {

    protected double basicSalary;
    protected double hra;
    protected double da;
    protected float taxPer;

    public SalaryInputs(double basicSalary, double hra, double da, float taxPer) {
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.da = da;
        this.taxPer = taxPer;
    }


    public double getHra() {
        return hra;
    }

    public double getDa() {
        return da;
    }

    public float getTaxPer() {
        return taxPer;
    }


    public double getBasicSalary() {
        return basicSalary;
    }

}
