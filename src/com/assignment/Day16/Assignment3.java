package com.assignment.Day16;

import java.util.ArrayList;

public class Assignment3 {


    public static void getAtParticularIndex(int index)
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("John");
        list.add("James");
        list.add("Jane");
        list.add("Noah");

        System.out.println("Element at index"+index+" :: "+list.get(index));
    }


    public static void main(String[] args) {
       getAtParticularIndex(2);
    }
}
