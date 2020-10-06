package com.assignment.Day16;

import java.util.LinkedList;
import java.util.List;

public class Assignment11 {


    public List<String> appendAtEndOfList(String elm1)
    {
        LinkedList<String> list= new LinkedList<>();
        list.add("Mark");
        list.add("Paul");
        list.add("Noah");
        list.add("James");
        list.addLast(elm1);

return list;

    }

    public static void main(String[] args) {
        List<String> list=new Assignment11().appendAtEndOfList("John");

        for(String item:list)
        {
            System.out.print(item+" ");

        }
    }


}
