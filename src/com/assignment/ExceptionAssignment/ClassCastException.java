package com.assignment.ExceptionAssignment;

public class ClassCastException {

    public void catchClassCastException(int x)
    {
        try{

            byte a= (byte)x;
            System.out.println(a);
        }
        catch (java.lang.ClassCastException e)
        {
            System.out.println("Exception::  "+e);
        }


    }


    public static void main(String[] args) {
        new ClassCastException().catchClassCastException(10000000);
    }
}
