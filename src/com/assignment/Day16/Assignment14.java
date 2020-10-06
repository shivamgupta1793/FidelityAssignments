package com.assignment.Day16;

import java.util.HashSet;

public class Assignment14 {


    public Object[] hashSetToAnArray(HashSet<String> set)
    { return set.toArray();
    }


    public static void main(String[] args) {

        HashSet<String> set=new HashSet<>();
        set.add("James");
        set.add("John");
        set.add("Jack");
        set.add("Paul");
        set.add("Noah");
       Object[] array=  new Assignment14().hashSetToAnArray(set);
        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
