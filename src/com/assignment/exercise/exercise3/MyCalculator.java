package com.assignment.exercise.exercise3;

public class MyCalculator implements AdvanceArithmetic{


    @Override
    public int divisor_sum(int n) {
        int i =1;
        int sum=0;
        while(i<10)
        {
         if(n%i==0)
             sum=sum+i;

            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        AdvanceArithmetic advanceArithmetic=new MyCalculator();
        int sum=advanceArithmetic.divisor_sum(56);
        System.out.println("Result:: "+sum);
    }
}
