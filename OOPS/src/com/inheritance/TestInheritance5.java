package com.inheritance;
//Create a class ‘rectangle’ that contains ‘length’ and ‘width’ as data members. 
//From this class derive a class named ‘box’ that has additional data member ‘depth’. 
//The members of the class ‘rectangle’ should consists of a constructor and a method area(). 
//The ‘box’ should have a constructor. Write a program to implement this.

class Rectangle {
    int length;
    int width;
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }
    int area() {
        return length * width;
    }
}

class Box extends Rectangle {
    int depth;
    Box(int l, int w, int d) {
        super(l, w);
        depth = d;
    }
}


public class TestInheritance5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Box box = new Box(10, 20, 30);
	        System.out.println("Area of rectangle: " + box.area());
	        System.out.println("Volume of box: " + box.area() * box.depth);
	}

}
