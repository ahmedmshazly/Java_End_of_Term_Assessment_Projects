package com.ALU;

public class Inheritance {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog();
        dog.name = "Rock";
        dog.color = "brown";
        dog.eat();
        dog.bark();

//        The Cat class

        Cat cat = new Cat();
        cat.name = "Ketty";
        cat.color = "blue";
        cat.eat();
        cat.meowing();

    }
}

class Animal {
    String color;
    String type;
    String name = "Animal";

    public void eat(){
        System.out.println("The animal " + name + " is eating");
    }

    public void move(){
        System.out.println("The animal " + name + " is moving");
    }

}

class Dog extends Animal{

    public void bark(){
        System.out.println("The dog which has the name " + name + " is barking");
    }
}

class Cat extends Animal{

    public void meowing(){
        System.out.println("The cat which has the name " + name + " is meowing");
    }
}
