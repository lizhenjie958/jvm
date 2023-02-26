package com.jie.chapter05;

public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
    }
}

class Animal{
  public void eat(){
      System.out.println("animal eat");
  }
}
class Dog extends  Animal{
    @Override
    public void eat(){
        System.out.println("dog eat");
    }
}
