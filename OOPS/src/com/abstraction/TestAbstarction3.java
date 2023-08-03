package com.abstraction;
public class TestAbstarction3  {
	
    private String money;
    private String jewellery;
    private int pinCode;

    public TestAbstarction3(String money, String jewellery, int pinCode) {
        this.money = money;
        this.jewellery = jewellery;
        this.pinCode = pinCode;
    }

    private void displayContents() {
        System.out.println("Contents of the locker:");
        System.out.println("Money: " + money);
        System.out.println("Jewellery: " + jewellery);
        System.out.println("Pin Code: " + pinCode);
    }
    
    public static void main(String[] args) {
    	TestAbstarction3  locker = new TestAbstarction3 ("400000", "Diamond necklace", 18902);
        locker.displayContents();
    }
}
    



