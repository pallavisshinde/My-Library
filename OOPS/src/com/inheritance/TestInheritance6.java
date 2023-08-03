package com.inheritance;
//7.Create class Bank(super)having getInterest() method returning interest .
//create any three child classes like sbi,icici,axis and override method in respective class

class Bank {
    int getInterest() {
        return 0;
    }
    }

class SBI extends Bank {
    int getInterest() {
        return 5;
    }
    }

class ICICI extends Bank {
    int getInterest() {
        return 6;
    }
    }

class AXIS extends Bank {
    int getInterest() {
        return 7;
    }
    }
public class TestInheritance6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Bank sbi = new SBI();
	       Bank icici = new ICICI();
	       Bank axis = new AXIS();
	       System.out.println("SBI interest rate: " + sbi.getInterest() + "%");
	       System.out.println("ICICI interest rate: " + icici.getInterest() + "%");
	       System.out.println("AXIS interest rate: " + axis.getInterest() + "%");
	   
	}

}
