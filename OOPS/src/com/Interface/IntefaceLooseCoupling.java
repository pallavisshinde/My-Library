package com.Interface;
//loose coupling

interface Vehicle{
	void move();
}

class Car implements Vehicle{
	@Override
	public void move() {
		System.out.println("travelling by car");
	}
}

class Bus implements Vehicle{
	@Override
	public void move() {
		System.out.println("travelling by bus");
	}
}


class Bike implements Vehicle{
	@Override
	public void move() {
	     System.out.println("travelling by bike");
	}
}

class Traveler{
	private Vehicle v;
	
	public Vehicle getV() {
		return v;
	}
	
	public void setV(Vehicle v) {
		this.v=v;
	}
	
	public void startJourney() {
		v.move();
	}
}
public  class IntefaceLooseCoupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
