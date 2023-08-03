package com.oopsTest;
//Create an abstract class MotorVehicle with the following details: 
//Data Members: (a) modelName (b)modelNumber (c) modelPrice 
//Methods: (a) display() to show all the details 
//Create a subclass of this class Carthat inherits the class MotorVehicle and add the following
//TEST-OOPS
//details: Data Members: (b) discountRate Methods: (a) display() method to display the Car name, model number, price and the discount rate. (b) discount() method to compute the discount


abstract class MotorVehicle {
    String modelName;
    int modelNumber;
    double modelPrice;

    public MotorVehicle(String modelName, int modelNumber, double modelPrice) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.modelPrice = modelPrice;
    }

    public abstract void display();
}

class Car extends MotorVehicle {
    double discountRate;

    public Car(String modelName, int modelNumber, double modelPrice, double discountRate) {
        super(modelName, modelNumber, modelPrice);
        this.discountRate = discountRate;
    }

    public void display() {
        System.out.println("Car name: " + modelName);
        System.out.println("Model number: " + modelNumber);
        System.out.println("Price: " + modelPrice);
        System.out.println("Discount rate: " + discountRate);
    }

    public double discount() {
        return modelPrice * discountRate;
    }
}
public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Car myCar = new Car("Toyota", 123, 20000.0, 0.1);
		myCar.display();
		System.out.println("Discount: " + myCar.discount());
	}

}
