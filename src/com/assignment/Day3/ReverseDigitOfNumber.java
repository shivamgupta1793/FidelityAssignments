package com.assignment.Day3;

public class ReverseDigitOfNumber {
    public static void main(String[] args) {

        int num=12345678;
        int count=0;
        while(num>0)
        {
            count = count * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(count);
    }
}
