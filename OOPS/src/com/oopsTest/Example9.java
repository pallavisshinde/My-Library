package com.oopsTest;
//example 9

 interface Player{
	void play();		
	}
	
	class Child implements Player{
		public void play() {
			System.out.println("playong with child");
		}
	}
	
	class Musician implements Player{
		public void play() {
			System.out.println("playing with instruments");
		}
	}
	
	class Actor implements Player{
		public void play() {
			System.out.println("playing a character");
		}
	
}

public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player child=new Child();
		child.play();
		Player Musician=new Musician();
		Musician.play();
		Player Actor=new Actor();
		Actor.play();
	}

}
