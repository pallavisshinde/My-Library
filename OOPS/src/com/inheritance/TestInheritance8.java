package com.inheritance;

import java.util.Scanner;

//1.Declare a class ‘Student’ with data members ‘name’, ‘roll number’ and ‘marks’. 
//Also declare a class ‘MyRecord’ which inherited from class ‘Student’. 
//Display name, roll number and percentage by creating the object of class MyRecord.

class Student2 {
    String name;
    int rollNumber;
    int marks;
}

class MyRecord2 extends Student2 {
    float calculatePercent() {
        return (float) marks / 100 * 100;
    }
}
public class TestInheritance8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyRecord2 record = new MyRecord2();
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter name: ");
	        record.name = scanner.nextLine();

	        System.out.print("Enter roll number: ");
	        record.rollNumber = scanner.nextInt();

	        System.out.print("Enter marks: ");
	        record.marks = scanner.nextInt();

	        System.out.println("Name: " + record.name);
	        System.out.println("Roll Number: " + record.rollNumber);
	        System.out.println("Percentage: " + record.calculatePercent() + "%");

	        
	}

}
