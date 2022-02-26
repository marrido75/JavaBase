package com.modifier;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.setN1();

        B b = new B();
        b.say();
    }
}

//只有默认和public可以修饰类