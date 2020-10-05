package com.assignment.ExceptionAssignment;

import java.io.File;
import java.io.FileInputStream;

public class FileNotFoundException {

    public void catchFileNotFoundException(String filePath) throws java.io.FileNotFoundException {

        File file = new File(filePath);
        FileInputStream fis=new FileInputStream(file);

    }


    public static void main(String[] args) {
        try {
            new FileNotFoundException().catchFileNotFoundException("C:/Users/mx.txt");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Exception:: "+e);
        }
    }

}

