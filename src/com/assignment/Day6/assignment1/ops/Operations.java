package com.assignment.Day6.assignment1.ops;

public class Operations {


    public double subtract(double val1,double val2)
    {
        if(val1>val2)

        return  val1-val2;
        else{
            return val2-val1;
        }
    }
    public double multiply(double val1,double val2)
    {
            return val2*val1;
    }

    public double divide(double val1,double val2)
    {
        return val1/val2;
    }

    public long factorial(int num)
    {
        int a=num;
        while(num>=2)
        {

             a =(num-1)*a;
             num--;
        }
        return a;
    }

    public int reverseDigit(long  num)
    {
        String number=String.valueOf(num);
        char[] digits=number.toCharArray();
        char[] reverseDigits=new char[digits.length];
         int a=0;
         int size=digits.length;
       while (size>0)
        {
            reverseDigits[a]=digits[size-1];
            size--;
            a++;
        }
        String reverseDigitString=new String(reverseDigits);
        Integer reverseDigit=new Integer(reverseDigitString);

        return reverseDigit;
    }

}
