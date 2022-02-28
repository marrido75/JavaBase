package com.hspedu.extend.test;

public class Base {
    int a;
    String b;

    //public Base() {
    //    System.out.println("Base无参构造器被调用");
    //}

    //当父类没有无参构造器时,子类Run需要用super(10,"123");指定下面的有参构造器
    //不然会报错

    public Base(int a, String b) {
        System.out.println("Base(int a, String b)无参构造器被调用");
        this.a = a;
        this.b = b;
    }
}
