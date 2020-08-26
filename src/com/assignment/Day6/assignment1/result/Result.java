package com.assignment.Day6.assignment1.result;

import com.assignment.Day6.assignment1.ops.Operations;

public class Result {

    public static void main(String[] args) {

        Operations operations=new Operations();
       double divisionResult= operations.divide(30.5,5);
        System.out.println("Division Result:: "+divisionResult);
       double factResult=operations.factorial(6);
        System.out.println("FactorialResult:: "+factResult);
       double multResult=operations.multiply(24.6,23);
        System.out.println("multIplication Result:: "+multResult);
       double subResult=operations.subtract(24,86);
        System.out.println("Subtraction Result:: "+subResult);
       double revDigResult=operations.reverseDigit(23142);
        System.out.println("ReverseDigit Result:: "+revDigResult);

    }
}
