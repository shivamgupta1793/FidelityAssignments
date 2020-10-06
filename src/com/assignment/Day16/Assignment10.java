package com.assignment.Day16;

import java.util.ArrayList;
import java.util.List;

public class Assignment10 {

    public List<Integer> joinTwoList(List<Integer> list1, List<Integer> list2)
    {
        list1.addAll(list2);
        return list1;
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
        List<Integer> newList=new Assignment10().joinTwoList(list1,list2);

        for(int item:newList)
        {
            System.out.print(item+" ");

        }
    }





}
