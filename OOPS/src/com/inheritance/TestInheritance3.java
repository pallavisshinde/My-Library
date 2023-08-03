package com.inheritance;
//Declare a class ‘student’ with data members ‘name’ and ‘roll number’.
// Also declare a class ‘Record’ which inherits class ‘student’. 
//Display name and roll number with address by creating the object of class ‘Record’.

 class Student3 {
String name;
int rollNumber;
}

 class Record3 extends Student {
    String address;

    public Record3(String name, int rollNumber, String address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Address: " + address);
    }
}
public class TestInheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Record3 record = new Record3("Shiv", 12345, "123 pune");
		record.displayDetails();
	}

}
