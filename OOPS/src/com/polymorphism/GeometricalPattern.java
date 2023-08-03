package com.polymorphism;
//WAP to create class shape with method draw().
//create class circle, square, Rectangle which extends Shape implement draw() differently in each child.

class Shape2{
	void draw() {
		System.out.println("Draw Shape");
	}
}
class circle extends Shape2{
	void draw() {
		System.out.println("Draw Circle");
	}
}
class square extends Shape2{
	void draw() {
		System.out.println("Draw square"); 	
	}
}
class rectangle extends Shape2{
	@Override
	void draw() {
		System.out.println("draw rectangle");
	}
}
public class GeometricalPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape2 s=new Shape2();
		s.draw();
		
		circle c=new circle();
		c.draw();
		
		square s1=new square();
		s1.draw();
		
		rectangle r=new rectangle();
		r.draw();
		

	}

}
