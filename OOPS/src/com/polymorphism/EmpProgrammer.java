package com.polymorphism;
//WAP to create class Programmer with Method workingHours().
//create class Employee which extends Programmer implement workingHours()differently in child.


class Programmer{
	void workingHours() {
		System.out.println("employee working for 7 hours in a day");
	}	
}
class Employee extends Programmer{
	@Override
	void workingHours() {
		System.out.println("employee working for 9 hours in a day");
	}
}
public class EmpProgrammer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Programmer p=new Programmer();
     p.workingHours();
     
     Employee e=new Employee();
     e.workingHours();
	}

}
