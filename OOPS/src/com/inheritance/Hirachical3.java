package com.inheritance;

class sports{
	int members=11 ;
	public void academey()
	{
		System.out.println("This is academey");
	}
}

class Cricket extends sports
{
	void cricket()
	{
		System.out.println("cricket");
	}
}

public class Hirachical3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricket crc=new Cricket();
		
	}

}
