package com.oopsTest;
//Create a base class Building that stores the number of floors of a building, number of rooms and it’s total footage. 
//Create a derived class House that inherits Building and also stores the number of bedrooms and bathrooms. 
//Demonstrate the working of the classes. create a second derived class Office that inherits Building and stores the number of telephones and tables. 
//Now demonstrate the working of all three classes


class Building {
    int numFloors;
    int numRooms;
    double totalFootage;
}

class House extends Building {
    int numBedrooms;
    int numBathrooms;
}

class Office extends Building {
    int numTelephones;
    int numTables;
}


public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 House myHouse = new House();
	        myHouse.numFloors = 2;
	        myHouse.numRooms = 5;
	        myHouse.totalFootage = 2000.0;
	        myHouse.numBedrooms = 3;
	        myHouse.numBathrooms = 2;

	        Office myOffice = new Office();
	        myOffice.numFloors = 1;
	        myOffice.numRooms = 10;
	        myOffice.totalFootage = 5000.0;
	        myOffice.numTelephones = 20;
	        myOffice.numTables = 30;
	    }
	}



