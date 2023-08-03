package com.inheritance;

class vehical
{
	int wheels=4;
}
class Car extends vehical{
	public void showcar() {
		System.out.println(wheels);
	}
}


public class Hirachical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Car c= new Car();
		c.showcar();
	}

}
