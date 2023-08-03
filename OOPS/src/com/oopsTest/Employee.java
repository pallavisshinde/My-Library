package com.oopsTest;

import java.util.Scanner;

//Write a program to define a class Employee to accept emp_id, emp _name, 
//basic_salary from the user and display the gross_salary.
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        int emp_id = sc.nextInt();
        System.out.print("Enter employee name: ");
        String emp_name = sc.next();
        System.out.print("Enter basic salary: ");
        double basic_salary = sc.nextDouble();
        double gross_salary = basic_salary + (0.2 * basic_salary) + (0.8 * basic_salary);
        System.out.println("Gross salary of employee " + emp_name + " with ID " + emp_id + " is " + gross_salary);
		
		
	}

}
