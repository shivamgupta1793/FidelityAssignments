package com.assignment.exercise.arithmentic;

 class Adder extends Arithmetic {


    public int add(int a, int b) {
        System.out.println("In Adder class");
        return a + b;
    }

     public static void main(String[] args) {
         Arithmetic arithmetic=new Adder();
         int rsult=arithmetic.add(11,12);
         System.out.println("Result Value:: "+rsult);

     }
}
