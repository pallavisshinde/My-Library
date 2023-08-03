package com.polymorphism;

class Vehicle4{
	long mph;
 String accelerate(long mph) {
		return "vehicle accelertae at  mph:"+mph;
	}
	 String stop() {
		return "vehicle is stop";
	}
	 String run() {
		return "vehicle is running";
		
	}
}

class Truck extends Vehicle4{
	@Override
    String accelerate(long mph) {
		return"vehicle accelerate at mph:"+mph;
	}
	
}
public class Vehicle3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vehicle4 v=new Vehicle4();
      v.accelerate(120);
        
        Truck t=new Truck();
         t.accelerate(150);
	}

}



