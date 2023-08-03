package com.Interface;

interface Cng_Car{
	void drive();
	void cng_car_kit();
}

interface Petrol_cast{
	void drive();
	void petrol_car_kit();
}


class HybridCar implements Cng_Car,Petrol_cast{
	
	@Override
	public void drive() {
		
		System.out.println("driving a hybrid car");
	}
	
	@Override
	public void petrol_car_kit() {
	System.out.println("petrol kit");
	}
	
	@Override
	public void cng_car_kit() {
		System.out.println("cng kit");
	}
}
public interface Interface3 {
     public static void main(String[]args) {
	HybridCar h=new HybridCar();
	h.drive();
	h.petrol_car_kit();
	h.cng_car_kit();
}
     
}
