package com.assignment.Day16;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment4 {


    public void searchInArrayList(int searchData)
    {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(14);
        arrayList.add(55);
        arrayList.add(22);
        arrayList.add(16);
        arrayList.add(56);
      if(arrayList.contains(searchData))
          System.out.println("Value is there in this arraylist");
      else
          System.out.println("Value not found");
    }


    public static void main(String[] args) {

        new Assignment4().searchInArrayList(56);
    }






}
