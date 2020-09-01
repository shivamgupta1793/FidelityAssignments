package com.assignment.exercise.exercise7;

import java.util.Scanner;

public class MissingLetter {

    public void findMissingChar(char input[])
    {
       for(int i=1;i<input.length;i++)
       {
          int asciiValue= (int)input[i-1];
          int asciiValue2=(int)input[i];
          if(!(asciiValue2==asciiValue+1))
          {

              if(asciiValue2-asciiValue>1)
              {
                for(int j=0;j<asciiValue2-(asciiValue+1);j++)
                {
                    System.out.print((char)(asciiValue2-j-1));
                }
              }
              else{
                  System.out.println((char)(asciiValue2-1));
              }
         }
       }
    }

    public static void main(String[] args) {
        MissingLetter missingLetter=new MissingLetter();
        missingLetter.findMissingChar(new char[]{'a','b','c','f','k','@'});


    }
}
