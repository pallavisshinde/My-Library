package com.polymorphism;
//write program to create class bike which fields color,speed and method
//bikeInfo() which is show color and speed of bike.Create class Pulsar which extends
//Bike implement bikeInfo() differetly child


class Bike{
	String color;
	int speed;
	public Bike(String color,int speed) {   // parameterised constructor is calling
	      this.color=color;
	      this.speed=speed;
	}
	  public void BikeInfo() {
		  System.out.println("bike color:"+color);
		  System.out.println("bike speed:"+speed);
}
}

class Pulsar extends Bike{

	public Pulsar(String color, int speed) {
		super(color, speed);
		// TODO Auto-generated constructor stub
	}
@Override	
public void BikeInfo(){
	System.out.println("bike pulsar");
    System.out.println("bike color:"+color);
    System.out.println("bike speed:"+speed);
}
	
	
	
}

public class Vehicle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Bike("blue",90);
		b.BikeInfo();
		
		Pulsar p=new Pulsar("BlackRed",45);
		p.BikeInfo();

	}

}
