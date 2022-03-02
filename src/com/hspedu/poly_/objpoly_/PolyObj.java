package com.hspedu.poly_.objpoly_;

public class PolyObj {
    public static void main(String[] args) {
        //体验对象多态的特点

        Animal animal = new Dog();
        animal.cry();
        //因为运行时，这时就执行到该行时，animal运行类型时dog.
        //所以这里运行dog.cry()

        animal = new Cat();
        animal.cry();//小猫在尖叫


        //原始方法
        //Tiger tiger = new Tiger();
        //tiger.cry();
        //
        //Lion lion = new Lion();
        //lion.cry();

        //对象多态
        Animal animals = new Tiger();
        animals.cry();//老虎叫
        animals = new Lion();
        animals.cry();//狮子叫


    }
}
