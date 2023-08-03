package com.Interface;


interface interfaceA{
	default void show() {
		System.out.println("show method of interface");
	}
}
interface interfaceB{
	default void  show() {
		System.out.println("show method of interfaceB");
	}
}
class Child implements interfaceA,interfaceB{
	
	public void show() {
		interfaceA.super.show();
		interfaceB.super.show();
	}
}
public class TestDiamondProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c=new Child();
		c.show();
	}

}
