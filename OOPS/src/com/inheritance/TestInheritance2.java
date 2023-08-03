package com.inheritance;
//1Declare a class ‘Student’ with data members ‘name’, ‘roll number’ and ‘marks’. 
//Also declare a class ‘MyRecord’ which inherited from class ‘Student’.
//Display name, roll number and percentage by creating the object of class MyRecord.


class Student{
	 String name;
	    int rollNumber;
	    int marks;
}

 class MyRecord extends Student {
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        double percentage = (marks / 100.0) * 100;
        System.out.println("Percentage: " + percentage + "%");
    }
}
public class TestInheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		 MyRecord record = new MyRecord();
	        record.name = "Pratik";
	        record.rollNumber = 123;
	        record.marks = 85;
	        record.display();
	}

}
