package com.assignment.Day16;

import java.util.ArrayList;
import java.util.List;

public class Assignment8 {


    public boolean compareLists(List<Integer> list1,List<Integer> list2)
    {
       return list1.equals(list2);
    }





    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(213);
        list1.add(232);
        list1.add(666);
        list1.add(12);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(10);
        list2.add(231);
        list2.add(22);
        list2.add(12);
        list2.add(213);
        list2.add(322);
        boolean result=new Assignment8().compareLists(list1,list2);
        if(result)
            System.out.println("Two Lists are equal");
        else
            System.out.println("Two lists are unequal");

            }

}
