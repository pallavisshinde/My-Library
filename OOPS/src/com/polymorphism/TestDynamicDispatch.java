package com.polymorphism;

import com.fnalKeyword.Apple;
import com.fnalKeyword.Fruit;

class Fruit{
	public void color() {
		System.out.println("Fruit green");
	}
}
class Apple extends Fruit{
	public void color() {
		System.out.println("Apple:red");
	}
}
class Banana extends Fruit{
	public void color(){
		System.out.println("Banana:yellow");
	}
}
public class TestDynamicDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object of type Fruit()
		Fruit f=new Fruit();
		//object of type apple
		Apple a=new Apple();
		//object of type banana
		Banana b=new Banana();
		 
		Fruit ft;
		
		f.color();
		
		f.color();
		a.color();
		b.color();
		ft.color();


		
		//ft=new Fruit();
		ft=f;   // refering class fruit object
		
		
		
		final Fruit f1;
		f1=new Apple();
	}

}
