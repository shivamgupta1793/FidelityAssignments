package com.assignment.exercise.exercise6;

public class RightAngleTriangle {

    public boolean isRightAngle(int h,int p,int b)
    {
       if(h*h==p*p+b*b)
           return true;
       else
           return false;
    }

    public static void main(String[] args) {
        RightAngleTriangle rightAngleTriangle=new RightAngleTriangle();
        boolean result=rightAngleTriangle.isRightAngle(13,12,5);
        if(result)
        System.out.println("Given Triangle is right Triangle ");
        else
            System.out.println("Given Triangle is not right Triangle");
    }
}
