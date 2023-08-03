package com.fnalKeyword;

//static method can not be overridden
//because method overriding is based on dynamic binding at runtime
//and static methods are bonded using static binding at compile time

//if we call a static method by using parent class object -parent class method will invoke

//if we call a static method by using child class object- child class method

//but if we call child class obj through parent ref - parent class method will hide
//child class method so parent class method will invoked

//can we overload static method ? ans is yes

//can we overload main() method ->yes
//can we override main() method ->no

public class TestStaticMethod {
	static class Flower{
		
		public static void fragrance() {
			System.out.println("flower method");
		}
	}
	static class Rose extends Flower{
		
		public static void fragrance() {
			System.out.println("rose method");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower f=new Rose();
		f.fragrance(); //method hiding
		//main("");
	}
	
	/*public static void main(String s) {
		System.out.println("overloaded method");
	}
   */

//toString() method gives string representation of an object

	}


