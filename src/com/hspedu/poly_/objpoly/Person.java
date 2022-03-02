package com.hspedu.poly_.objpoly;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void eat(Animal animal,Foods foods) {
        //Person 正在给 Animal 喂 Foods
        System.out.println(name + "正在给"+ animal.getName()+"喂"+foods.getName());
    }
}
