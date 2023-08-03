package com.fnalKeyword;

public class FinalKey1 {
	final int v=2023;
	final int num;
	
	static final int x;
	static {
		x=56;
	}
	public FinalKey1() {
		num=1212;
		
		
		}
	public FinalKey1(String str) {
		num=785;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        a++;
        System.out.println(a);
		
        final int b;
        b=10;
        int c=a+b;
        //b++;can not change value for final variable
        System.out.println(b);
		System.out.println(c);
		
		FinalKey1 k=new FinalKey1();
		System.out.println(k.v);
	}

}
