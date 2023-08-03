package com.inheritance;

class Person{
	
	protected String name;
	protected int age;
	protected String email;
	protected String contact;
	
	Person(String name,int age,String emIL,String cotact){
		this.name=name;
		this.age=age;
		this.email=email;
		this.contact=contact;
	}
	
	public void show() {
		System.out.println("Name:\t:"+name);
		System.out.println("Age:\t:"+age);
		System.out.println("Email:\t:"+email);
		System.out.println("Contact:\t:"+contact);
		
	}
}

    class Teachert extends Person{
    	float salary;
    	String Degree;
    	Teachert(String name,int age,String email,String contact,float salary,String Degree){
    		super(name,age,email,contact);
    		
    		this.salary=salary;
    		this.Degree=Degree;
    	}
    	
    	public void show() {
    		System.out.println("Salary\t:"+salary);
    		System.out.println("Degree\t:"+Degree);
    		
    	}
    }
public class TestInheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p=new Person("Ram",25,"ram27@gmail.com","NinetwosixFive");

	}

}
