package com.assignment.Day16;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Assignment12 {

    public void iterateLinkedList(LinkedList<String> list)
    { Iterator itr=list.descendingIterator();

        while (itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }

    }

    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Mark");
        list.add("John");
        list.add("James");
        list.add("Noah");
        list.add("Paul");

        new Assignment12().iterateLinkedList(list);
    }

}
