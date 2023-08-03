package com.polymorphism;
//)WAP to create class Person with method readScript().
//create class Actor which extends Person implement readScript() differently in child.

class Person{
	void readScript1() {
		System.out.println("Actor is reading script of movie RRR");}
}
	
class Actor extends Person{
	
	void readScript() {
		System.out.println("Actor is readig script of movie ROY");
	}
}

public class Bollywood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.readScript1();
		
		Actor a=new Actor();
		a.readScript();

	}

}
