package com.Interface;

import java.io.Serializable;

// single astarct method interface(SAM)
//JAVA 8
@FunctionalInterface
interface Washable{
	
	void wash(); //abstarct method
	default void m1() {
		
	}
}

@FunctionalInterface
interface A{
	void m1();
}
//marker interface
class B implements Serializable{
	
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
