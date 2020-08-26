package com.assignment.exercise.exercise2;

 class MyBook extends Book {

    String title;

    @Override
    void setTitle(String title) {
        System.out.println("In class MyBook");
        this.title=title;
        System.out.println(title);
    }
}
