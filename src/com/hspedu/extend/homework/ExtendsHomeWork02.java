package com.hspedu.extend.homework;

public class ExtendsHomeWork02 {
    public static void main(String[] args) {
        C02 c02 = new C02();
        //
    }
}

class A02 {
    public A02() {
        System.out.println("A类");//4
    }
}

class B02 extends A02 {
    public B02() {
        System.out.println("b类无参");
    }

    public B02(String name) {
        //super();//3
        System.out.println(name + "b类有参");//5
    }
}

class C02 extends B02 {
    public C02() {
        this("hello");//1
        System.out.println("c类无参");//7
    }

    public C02(String name) {
        super("hahah");//2
        System.out.println("c类有参");//6
    }
}

//A类
//hahahb类有参
//c类有参
//c类无参
//构造器中没有写this说着super.会有个默认的super()