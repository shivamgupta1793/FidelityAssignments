package com.assignment.Day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment7 {

    public List<Integer> reverseElements(List<Integer> list)
    {
        Collections.reverse(list);

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
        List<Integer> reverseList=new Assignment7().reverseElements(list);
        for(int item:reverseList)
        {
            System.out.print(item+" ");

        }
    }

}
