package com.polymorphism;
//method overriding
//return type
//void-void
//primitive-same return type which is present in persent class
//e.g:parent-int
//    child-int

class shape{
	public int draw() {
		System.out.println("shape class");
		return 0;
	}
}
class rect extends shape{
	public int draw() {
		System.out.println("rect class");
		return 10;
	}
}
		
public class MethodOverriding2 {
	public static void main (String[]args) {
		shape s1=new shape();
		s1.draw();
		
		rect r1=new rect();
		r1.draw();
		
		shape s2=new rect();
		s2.draw();
		
		
	}
	

}
