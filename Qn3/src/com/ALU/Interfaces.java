package com.ALU;

public class Interfaces {

    public static void main(String[] args) {
	// write your code here
        IAnimal animal = new IDog();
        animal.eat();
        animal.run();
    }
}

interface IAnimal {

    public String name = null;

    abstract public void run();

    abstract public void eat();

}

class IDog implements IAnimal {

    @Override
    public void run() {
        System.out.println("The Dog is running");
    }

    @Override
    public void eat() {
        System.out.println("The Dog is eating");
    }
}

/*

That's how interfaces works

 * You cannot create object of interface. They are just a blueprint of a class.
 *       * Use implements keyword
 *       * They can only contain abstract methods.
 *
 *       1. For Methods
 *           * They are public and abstract
 *           * No method body. You cannot write code within your method.
 *
 *       2. For Variables
 *           * Avoid using field variables
 *           * But when used they are constants. Their values cannot be changed once defined.
 *           * They are public, static and final
 */