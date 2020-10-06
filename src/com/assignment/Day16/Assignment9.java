package com.assignment.Day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment9 {


    public List<String> swapElementsOfList(String elm1, String elm2)
    {
        List<String> list1=new ArrayList<>();
        list1.add("John");
        list1.add("James");
        list1.add("Noah");
        list1.add("Paul");
        list1.add("Jean");

        int index1=list1.indexOf(elm1);
        int index2=list1.indexOf(elm2);
        Collections.swap(list1,index1,index2);
        return list1;
    }


    public static void main(String[] args) {
        List<String> swapList=new Assignment9().swapElementsOfList("John","Noah");

        for(String item:swapList)
        {
            System.out.print(item+" ");

        }

    }






}
