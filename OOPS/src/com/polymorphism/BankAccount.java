package com.polymorphism;
//A bank has a principal amount and a rate of interest which is 2%. 
//A savings account has a rate of interest 3% while a current account has 5%. 
//Write a method that displays the rate of interest based on whether the account is default/ savings/ current.


class Bank{
	int rateofinterest(){
		return (int) 2.0;
	}
	
}

class SavingAccount extends Bank{
	@Override
	int rateofinterest() {
		return(int)3.0;
	}
}

class CurrentAccount extends Bank {
	@Override
	int rateofinterest() {
		return (int)5.0;
	}
	
}
public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b=new Bank();
		b.rateofinterest();
		System.out.println("rate of interest:"+rateofinterest +"%");
		
		SavingAccount s=new SavingAccount();
		s.rateofinterest();
		
		CurrentAccount c=new CurrentAccount();
		c.rateofinterest();

	}

}
