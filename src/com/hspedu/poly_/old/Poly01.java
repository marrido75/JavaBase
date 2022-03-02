package com.hspedu.poly_.old;

public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("jack");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("大骨头");


        master.feed(dog,bone);

        Cat cat = new Cat("小花猫");
        Fish fish = new Fish("黄花鱼");

        master.feed(cat,fish);


    }
}


