package com.Interface;

interface Printable{
	int a=10;
	void showMsg();   //by default public and abstarct
}
class Print implements Printable{
	public void showMsg() {
		System.out.println("printing msg");
	}
}

public class InterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Print p=new Print();
		p.showMsg();
		
		
		//Printable p2=new Printable(); //Ce-can not create instances
		Printable pl=new Print();
		pl.showMsg();
	}

}
