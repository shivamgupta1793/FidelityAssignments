package com.assignment.ExceptionAssignment;

import java.io.File;

public class NullPointerException {

    String path;

    public void catchNullPointerException()
    {
        try{

            File file=new File(path);
        }
        catch (java.lang.NullPointerException e)
        {
            System.out.println("Excpetion :: "+e);
        }

    }


    public static void main(String[] args) {

        new NullPointerException().catchNullPointerException();

    }
}
