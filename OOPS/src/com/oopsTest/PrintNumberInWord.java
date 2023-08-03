package com.oopsTest;

import java.util.Scanner;

//Write a program which will accept an integer from the user and
// pass the value to a method called PrintNumberInWord that will print "ONE", "TWO",... , "NINE", "ZERO" 
//if the integer variable "number" is 1, 2,... , 9, or 0, respectively.

public class PrintNumberInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int number=sc.nextInt();
		PrintNumberInWord(number);
				

	}

	private static void PrintNumberInWord(int number) {
		// TODO Auto-generated method stub
		switch(number) {
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
		    System.out.println("five");
		    break;
		case 6:
			System.out.println("six");
			break;
		case 7:
			System.out.println("seven");
			break;
		case 8:
			System.out.println("eight");
			break;
		case 9:
			System.out.println("nine");
			break;
		default:
			System.out.println("invalid number");
			break;
	}

	}}
