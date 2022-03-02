package com.hspedu.poly_.detail_;

public class Animal {
    String name = "动物";
    int age = 10;

    public void sleep() {
        System.out.println("sleep");
    }

    public void run() {
        System.out.println("run");
    }

    public void eat() {
        System.out.println("eat");
    }

    public void show() {
        System.out.println("展示猪仔仔做啥");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("狗吃骨头");
    }

}