package com.assignment.Day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment5 {

    public List<Integer> sortArraylist(List<Integer> list)
    {
         Collections.sort(list);

         return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(231);
        list.add(22);
        list.add(12);
        list.add(213);
        list.add(322);
        List<Integer> sortedList=new Assignment5().sortArraylist(list);
        for(int item:sortedList)
        {
            System.out.print(item+" ");

        }
    }



}
