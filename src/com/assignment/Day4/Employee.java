package com.assignment.Day4;

public class Employee {


    public int employeeCode;
    public String employeeName;
    public String employeeDepartment;
    public int employeeNumber;

    public int getEmployeeCode(int employeeCode) {
        this.employeeCode=employeeCode;
        System.out.println("Employee Code:: "+employeeCode);
        return employeeCode;
    }

    public String getEmployeeName(String employeeName) {
        this.employeeName=employeeName;
        System.out.println("Employee Name:: "+employeeName);
        return employeeName;
    }

    public String getEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment=employeeDepartment;
        System.out.println("Employee Department:: "+employeeDepartment);
        return employeeDepartment;
    }

    public int getEmployeeNumber(int employeeNumber) {
        this.employeeNumber=employeeNumber;
        System.out.println("EmployeeNumber:: "+employeeNumber);
        return employeeNumber;
    }

}
