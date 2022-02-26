package com.modifier;

public class A {
    public int n1 = 100; //都可以访问
    protected int n2 = 200; //本包可以访问
    int n3 = 300;   //同类同包可以
    private int n4 =400;

    public void setN1() {
        System.out.println(n1+"\t"+n2+"\t"+n3+"\t"+n4);
    }
}

class Test{
    public static void main(String[] args) {
        A a = new A();
        a.setN1();

        B b = new B();
        b.say();
    }
}


