package com.inheritance;

import java.util.Scanner;

//Create a base class to get two numbers from user in the base class. 
//The derived class contains a method ‘dispMax()’. Which displays maximum of two numbers and a method ‘dispMin()’ to display minimum of two numbers. 
//Use constructors.


class BaseClass{
    private int num1;
    protected int num2;

    public BaseClass() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();
    }
}
class DerivedClass extends BaseClass {
    private int num1;

	public DerivedClass() {
        super();
    }

    public void dispMax() {
        int max = Math.max(num1, num2);
        System.out.println("Maximum of " + num1 + " and " + num2 + " is " + max);
    }

    public void dispMin() {
        int min = Math.min(num1, num2);
        System.out.println("Minimum of " + num1 + " and " + num2 + " is " + min);
    }
}

public class TestInheritance4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DerivedClass derivedClass = new DerivedClass();
	        derivedClass.dispMax();
	        derivedClass.dispMin();
	}

}
