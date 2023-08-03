package com.inheritance;
//8.	Create shape class and show example of dynamic dispatching using child classes


class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class TestInheritance7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shape s1 = new Circle();
	        Shape s2 = new Square();
	        
	        s1.draw(); 
	        s2.draw();
	}

}
