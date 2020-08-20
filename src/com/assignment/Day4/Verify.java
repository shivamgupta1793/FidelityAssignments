package com.assignment.Day4;

public class Verify {

    public static  void main(String...s)
    {Employee employee=new Employee();
        employee.getEmployeeCode(400);
        employee.getEmployeeDepartment("Testing");
        employee.getEmployeeName("Varun");
        employee.getEmployeeNumber(50);

        Student student=new Student();
        student.getStudentClass(10);
        student.getStudentMarks(23.5f);
        student.getStudentRollNumber(25);
        student.getStudentSection('C');

        Bank bank=new Bank();
        bank.getNumberOfEmployee(500);
        bank.getBankName("HDFC");
        bank.getBankBranchCode(200);


    }
}
