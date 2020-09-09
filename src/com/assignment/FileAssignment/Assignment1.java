package com.assignment.FileAssignment;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Assignment1 {



    public String[] listOfFiles(String filePath)
    {
        File fileObject=new File(filePath);

        File[] lisOfFiles=fileObject.listFiles();

        String[] fileNames=new String[lisOfFiles.length];
        int i=0;
        for(File file :lisOfFiles)
        {
            fileNames[i]=file.getName();
            i++;
        }

        return fileNames;
    }


    public static void main(String[] args) {

        Assignment1 assignment1=new Assignment1();
        String[] fileNames=assignment1.listOfFiles("C:\\FidelityAssignment\\src\\com\\assignment\\Day6");

    }
}
