package com.assignment.FileAssignment;

import java.io.File;

public class Assignment2 {


    public boolean  verifyFileExist(String filePath)
    {

        File file=new File(filePath);

        if(file.exists()){
            System.out.println("File exists at given path");
            return true;}
        else {
            System.out.println("File doesn't exists at given path");
            return false;
        }
    }


    public static void main(String[] args) {
        Assignment2 assignment2=new Assignment2();
        boolean file=assignment2.verifyFileExist("C:\\FidelityAssignment\\src\\com\\assignment\\FileAssignment\\Assignment1.java");
    }
}
