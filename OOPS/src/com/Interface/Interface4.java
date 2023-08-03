package com.Interface;
//extended interface

interface Mobile{
	void call();
}

interface Basic extends Mobile{
	void msg();
}

class Nokia implements Basic{
	public void msg() {
		System.out.println("Nokia phone msg method");
	}
	public void call() {
		System.out.println("nokia phone call method");
	}
}
public interface Interface4 {
	public static void main(String[]args) {
		Nokia n=new Nokia();
		n.call();
		n.msg();
	}

}
