package com.fnalKeyword;


class Fruit{
	public void color() {
		System.out.println("Fruit green");
	}
}
class Apple extends Fruit{
	double price=25;
	public void color() {
		System.out.println("Apple:red");
	}
}
class Banana extends Fruit{
	public void color() {
		System.out.println("Banana:yellow");
	}
}

public class TestDynamicDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		//object of type Fruit
		Fruit f=new Fruit();
		//object of type apple
		Apple a=new Apple();
		//object of type banana
		Banana b=new Banana();
		
		f.color();
		a.color();
		b.color();
		
		System.out.println("-----------------");
		
		Fruit ft;
		
		//ft=new Fruit();
		ft=f;   // refering class fruit object
		
		f.color();
		
		ft=b;
		ft.color();
		
		final Fruit f1;
		f1=new Apple();
		
		//f1=new Banana(); can not reassign
	}

}





