package com.fnalKeyword;
//final key method demo


class os{
	public void coding() {
		System.out.println("code method in parent class");
	}
	final public void Display() {
		System.out.println("final method in parent class");
	}
	
	class Laptop extends os{
		public void coding() {
			System.out.println("windows coding method");
		}
		public void display() {
			System.out.println("display");
		}
}
public static class FinalKeyMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
}
