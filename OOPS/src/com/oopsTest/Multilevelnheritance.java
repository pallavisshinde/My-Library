package com.oopsTest;
//Write a Java program to explain “multilevel inheritance.


class Coffee{
	 static void drink() {
		 System.out.println("drinking...");
	 }
}

class ColdCoffee extends Coffee{
	void make() {
		System.out.println("drinkin1....");
	}
}

class Cappuccino extends Coffee{
	static void filetr() {
		System.out.println("drink2....");
	}

	public static void make() {
		// TODO Auto-generated method stub
		
	}
}
public class Multilevelnheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Cappuccino c=new Cappuccino();
		Cappuccino.drink();
		Cappuccino.make();
		Cappuccino.filetr();	
	}

}
