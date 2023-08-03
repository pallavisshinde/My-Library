package com.polymorphism;
//create class with ThisSuprDemo and use this,super,keyword using variable,constructors and methods

class Girl{
	String name;
	int age;
	
	Girl(String name,int age){
		this.name=name;
		this.age=age;
	}

	public void describe() {
	System.out.println( name+" "+age);
		
	}
}

class Student extends Girl{
	String marks;
	
	Student(String name,int age,String marks){
		super(name,age);
		this.marks=marks;
	}
	
}

class Sister{
	int height;
	int weight;
	
	Girl(int height)
}
public class ThisSuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Girl g=new Girl();
       g.describe();
        
        
        
	}

}
