package com.inheritance;
class Banking{
	
	public void doTransaction() {
		System.out.println("transaction by bank parent class");
	}
}

class OnlineBanking extends Banking{
	
	public void doTransaction() {
		//super.doTransaction();
		System.out.println("transaction by bank online child class");
		super.doTransaction();
	}
}
public class TestBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnlineBanking ob=new OnlineBanking();
		ob.doTransaction();


	}

}
