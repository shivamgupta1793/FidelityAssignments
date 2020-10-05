package com.assignment.ExceptionAssignment;

public class ArrayIndexOutOfBoundException {


    public void catchArrayIndexException(int num[])
    {
        try{

            for(int i=0;i<=num.length;i++)
            {

                System.out.println("Array:: "+num[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception::  "+e);
        }


    }


    public static void main(String[] args) {
        new ArrayIndexOutOfBoundException().catchArrayIndexException(new int []{4,2,3,45,46});
    }

}
