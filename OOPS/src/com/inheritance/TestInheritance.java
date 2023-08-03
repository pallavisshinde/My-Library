package com.inheritance;


class Human {
    String name;
    String gender;

    public Human(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void find(Man man, Woman woman) {
        if (man.age > woman.age) {
            System.out.println(man.name + " is elder");
        } else {
            System.out.println(woman.name + " is elder");
        }
    
    
    }
    class Man extends Human {
        int age;

        public Man(String name, String gender, int age) {
            super(name, gender);
            this.age = age;
        }
    }

    class Woman extends Human {
        int age;

        public Woman(String name, String gender, int age) {
            super(name, gender);
            this.age = age;
        }
    }



public class TestInheritance {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		Man Ram = new Man("Ram", "Male", 30);
		Woman Priya = new Woman("Priya", "Female", 25);
		Human human = new Human("", "");
		human.find(Ram, Priya);
	}

}}

