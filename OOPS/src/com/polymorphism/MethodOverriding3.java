package com.polymorphism;
//non primitive data type

class Calculator{
	public Object add() {
		return 12;
	}
}
class SimpleCalculator extends Calculator{
	public String add() {
		return "hello";
	}
}

public class MethodOverriding3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c1=new Calculator();
		c1.add();
		
		SimpleCalculator s1=new SimpleCalculator();
		//without -covariant
		String msg=(String) s1.add();
		System.out.println(msg);
		
        //with co-variant
//		String m=s1.add();
//		System.out.println(m);

	}

}
