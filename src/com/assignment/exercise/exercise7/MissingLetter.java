package com.assignment.exercise.exercise7;

public class MissingLetter {

    public void findMissingChar(char input[])
    {
       for(int i=1;i<input.length;i++)
       {
          int asciiValue= (int)input[i-1];
          int asciiValue2=(int)input[i];
          if(!(asciiValue2==asciiValue+1))
          {
              System.out.println("Character Not Found:: "+(char)(asciiValue2-1));
         }
       }
    }

    public static void main(String[] args) {
        MissingLetter missingLetter=new MissingLetter();
        missingLetter.findMissingChar(new char[]{'a','b','c','e'});
    }
}
