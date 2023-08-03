package com.inheritance;
//parent class
class Teacher{
	int student=50;
}
class Department extends Teacher{
	public void showdepartment() {
		System.out.println(student);
	}
	
}

public class Hirachical2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d=new Department();
		d.showdepartment();
	}

}
