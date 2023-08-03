package com.polymorphism;
//WAP to create class company with method address. 
//create class eBay which extends company implement address() differently in eBay class.
//Here the method address ()has been overridden in child class.


//create class company with method address. 
class Company{       
	void Address() {
		System.out.println("Winspire solutions,Baner");
	}
}
class eBay extends Company{     //class eBay which extends company 
	@Override                   
	void Address() {            //method address ()has been overridden in child class.
		System.out.println("Hexaware pvt.ltd,Talegaon");
	}
}
public class MainCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Company c=new Company();    //object created
         c.Address();                //address method calling
         
         eBay eb=new eBay();
         eb.Address();
         
	}

}
