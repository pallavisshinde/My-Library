package com.Interface;


interface Calculator{
	public int add(int a,int b);
	public int sub(int a,int b);
	public int multiply (int a,int b);
	public int division(int a,int b);
	
	default void display() {
		System.out.println("Default method in interface");
	}
}

class BasicCal implements Calculator{
	@Override
	public int add(int a,int b) {
		return a+b;
	}
    @Override
    public int sub(int a,int b) {
    	return a-b;
    }
	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	@Override
	public int division(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
}
public class TestInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BasicCal b=new BasicCal();
        System.out.println("add:"+b.add(12,3));
        System.out.println("sub:"+b.sub(12, 3));
        System.out.println("multiply:"+b.multiply(12, 3));
        System.out.println("div:"+b.division(12, 3));
        b.display();
	}

}
