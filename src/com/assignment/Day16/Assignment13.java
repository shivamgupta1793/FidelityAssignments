package com.assignment.Day16;

import java.util.LinkedList;
import java.util.List;

public class Assignment13 {

    public List<String> appendFirstAndEndofList(String fisrtElm, String lastElm) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Mark");
        list.add("Paul");
        list.add("Noah");
        list.add("James");
        list.addLast(fisrtElm);
        list.addLast(lastElm);

        return list;

    }

    public static void main(String[] args) {
        List<String> list = new Assignment13().appendFirstAndEndofList("John", "Jack");

        for (String item : list) {
            System.out.print(item + " ");

        }

    }
}
