package com.hspedu.poly_.objpoly;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("大卫");
        Animal animal = new Animal("大黄");
        Foods foods = new Foods("骨头");

        person.eat(animal,foods);

    }
}
