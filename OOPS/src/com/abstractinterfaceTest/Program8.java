package com.abstractinterfaceTest;


class CodeA
{
 public String type = "A ";
 public CodeA() {
 System.out.print("CodeA ");
 }
}

public class Program8 extends CodeA
{
 public Program8() {
 System.out.print("CodeB ");
 }

 void go()
 {
 type = "B ";
 System.out.print(this.type + super.type);
 }

 public static void main(String[] args)
 {
 new Program8().go();
 }
}



