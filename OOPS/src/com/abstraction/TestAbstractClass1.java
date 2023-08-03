package com.abstraction;

abstract class Animal{
	
	public String name;
	public Animal(String name) {
		this.name=name;
	}
	public abstract void makeSound();
	//protected abstract void run()
	//abstract void sleep()


public void eat() {
	System.out.println("Animal is eating");
}
}

class Dog extends Animal{
	Dog(String name){
		super(name);
	}
	
	
		@Override
		public void makeSound() {
			System.out.println("dog barks");
		}
	}


class Cat extends Animal{
	
	 Cat(String name) {
		 super(name);
		// TODO Auto-generated constructor stub
	}
     @Override
	public void makeSound() {
		System.out.println("cat meows");
	}
}

public class TestAbstractClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	Animal a=new Dog("Max");
	a.eat();
	a.makeSound();
	
	a=new Cat("luna");
	a.eat();
	a.makeSound();
}
}