package com.polymorphism;

class Mobile{
	
	public void msg() {
		System.out.println("Mobile msg() method");
	}
	
}
class Basic extends Mobile{
	public void msg() {
		System.out.println("Basic msg() method");
	}
	
	public void player() {
		System.out.println("player method from child class");
	}
}

class Android extends Mobile{
	public void msg() {
		System.out.println("Android msg()method");
	}
	
	public void Notification() {
		System.out.println("Android notification method");
	}
}

public class TestDynamicPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Mobile m=new Basic(); 
        m.msg();
        
       
        //assigning a sub class object to superclass ref
        Mobile m2=new Basic(); //upcasting or dyamic dispatch
        m2.msg();  //child class
        
        Mobile m3=new Android();
       m3.msg();
       
       Mobile m4=new Android ();
       ((Android) m4).Notification();
       
	}

}
