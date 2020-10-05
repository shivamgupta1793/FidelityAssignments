package com.assignment.ExceptionAssignment;

public class ArithmeticException {


    public void catchArithmeticException(int a,int b)
    {
        try{
            int x=a/b;
        }
        catch (java.lang.ArithmeticException e)
        {
            System.out.println("Exception::  "+e);
        }


    }


    public static void main(String[] args) {
        new ArithmeticException().catchArithmeticException(10,0);
    }
}
