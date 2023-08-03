package com.polymorphism;
//WAP to create a class Kid with method readBook() and another method readBook () with 2
//parameters. The method readBook here is over-loaded (same method name but different
//parameters) Create a class BigKid which extends Kid created above. Implement readBook() differently in
//BigKid class. Here the method readBook() has been over-ridden in the child class BigKid()


   class Kid{
	   
	   
	  void readBook() {
		  System.out.println("book reading");   
	   }
	  void readBook(String bookName,int price) {     // same method name but diff.parameters
		  System.out.println("bookName"+bookName+"price:"+price);
	  }
   }
   class BigKid extends Kid{
	  @Override 
	   void readBook() {
		   System.out.println("Big kid is reading Book");
	   }
   }
   
public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kid k=new Kid();
		k.readBook();
		k.readBook("Aladin",500);
		
		BigKid bk=new BigKid();
		bk.readBook();
		bk.readBook("Cindrella",950);
		

	}

}
