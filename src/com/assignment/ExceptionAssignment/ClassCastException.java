package com.assignment.ExceptionAssignment;

import java.util.HashSet;

public class ClassCastException {


    public Object[] hashSetToAnArray(HashSet<String> set) {
        return set.toArray();
    }


    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("James");
        set.add("John");
        set.add("Jack");
        set.add("Paul");
        set.add("Noah");
        String[] array = (String[]) new ClassCastException().hashSetToAnArray(set);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
