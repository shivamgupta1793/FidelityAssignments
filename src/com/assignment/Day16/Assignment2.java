package com.assignment.Day16;

import java.util.ArrayList;

public class Assignment2 {


    public static void insertAtFirstIndex()
    {
        ArrayList<String> list=new ArrayList<>();
        list.add(0,"James");
        list.add("John");
        list.add("Noah");
        System.out.println("elementAtFirstIndex:: "+list.get(0));

     }


    public static void main(String[] args) {
        insertAtFirstIndex();
    }
}
