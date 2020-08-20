package com.assignment.Day4;

public class Student {

    private int studentRollNumber;
    private int studentClass;
    private String studentName;
    private float studentMarks;
    private char studentSection;

    public int getStudentRollNumber(int studentRollNumber) {
        this.studentRollNumber=studentRollNumber;
        System.out.println("StudentRollNumber:: "+studentRollNumber);
        return studentRollNumber;
    }

    public int getStudentClass(int studentClass) {
        this.studentClass=studentClass;
        System.out.println("StudentClass:: "+studentClass);
        return studentClass;
    }

    public String getStudentName(String studentName) {
        this.studentName=studentName;
        System.out.println("StudentName:: "+studentName);
        return studentName;
    }

    public float getStudentMarks(float v) {
        this.studentMarks=studentMarks;
        System.out.println("StudentMarks:: "+studentMarks);
        return studentMarks;
    }

    public char getStudentSection(char c) {
        this.studentSection=studentSection;
        System.out.println("StudentSection:: "+studentSection);
        return studentSection;
    }


}
