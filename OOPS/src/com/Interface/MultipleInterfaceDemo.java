package com.Interface;

interface intA{
	void m1();
}
interface intB{
	void m2();
}


class SimpleChild implements intA,intB{
	public void m1() {
		System.out.println("m1 method from intA");
	}
	
	public void m2() {
		System.out.println("m2 method from intB");
	}
}
public class MultipleInterfaceDemo {
	
	public static void main(String[]args) {
		
		SimpleChild s=new SimpleChild();
		s.m1();
		s.m2();
	}
}


