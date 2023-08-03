package com.polymorphism;


class vehicle{
	public void drive(int a) {
		System.out.println("Inside parent class");
	}
}
class Car extends vehicle{
	@Override
	public void drive(int s) {
		System.out.println("Inside child class");
	}
	 public void speed() {
		 System.out.println("Speed Method");
	 }
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle v=new vehicle();
		v.drive(0);
	  

	}

}
