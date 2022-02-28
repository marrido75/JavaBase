package com.hspedu.extend.homework;

public class ExtendsHomeWork01 {
    public static void main(String[] args) {
        B b = new B();
    }
}

class A {
    public A() {
        System.out.println("a");
    }

    public A(String name) {
        System.out.println("a name");
    }

}

class B extends A{
    B(){
      this("abc");//1.这里会默认调用A类的super()->A()  输出 a
      System.out.println("b");//3.
    }

    B(String name){

        System.out.println("b name");//2.
    }
}