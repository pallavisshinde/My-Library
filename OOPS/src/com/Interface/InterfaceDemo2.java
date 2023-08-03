package com.Interface;

   interface language
   {
	   void showName(String name);
   }
   class ProgrammingLanguage implements language{
	   
	   public void showName(String name) {
		   System.out.println("Programming Language Name:"+name);
	   }
   }
   
   class CommunicationLanguage implements language
   {
	   public void showName(String name) {
		   System.out.println("Communuication language:"+name);
	   }
   }

	


public interface InterfaceDemo2 {
	public static void main(String args[])
	{
		language ob;
		
		language ob1=new ProgrammingLanguage();
		ob1.showName("java");
		
		ob= new CommunicationLanguage();
		ob.showName("english");
	}

}
