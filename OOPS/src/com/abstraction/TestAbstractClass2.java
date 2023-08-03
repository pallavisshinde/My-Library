package com.abstraction;



abstract class Mobile{
	private String modelName;
	private double price;
	
	public abstract void call();
	
	public void display() {
		System.out.println("Mobile display method");
	}
}

class Basic3 extends Mobile{
	@Override
	public void call() {
		System.out.println("basic mobile calling");
	}
	
}

abstract class Android extends Mobile{
	public abstract void call();
	
}
class OnePlus extends Android{
	
	public void call() {
		System.out.println("oneplus calling method");
	}
}
public class TestAbstractClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
