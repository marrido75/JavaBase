package com.hspedu.poly_.ployarr02;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        //多态单个调用
        //Animal animal = new Cat("猫", 10, "鱼");
        //System.out.println(animal.like());
        //
        //animal = new Dog("狗", 99, "骨头");
        //System.out.println(animal.like());

        //数组调用

        Animal[] animals = new Animal[5];

        //设置对象参数
        animals[0] = new Cat("猫", 10, "鱼");
        animals[1] = new Cat("2猫", 13, "da鱼");
        animals[2] = new Cat("3猫", 45, "xiao鱼");
        animals[3] = new Dog("哈巴狗", 5, "盆骨");
        animals[4] = new Dog("牧羊犬", 45, "大棒骨");

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].like());
        }

    }

}
