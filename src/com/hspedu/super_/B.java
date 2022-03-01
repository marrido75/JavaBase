package com.hspedu.super_;

public class B extends A {

    public void hi() {
        //访问父类的属性，但不能访问父类的private属性   [案例]super.属性名
        System.out.println(super.n1 + super.n2 + super.n3);// + super.n4
    }


    //访问父类的方法，不能访问父类的private方法
    // super.方法名（参数列表）
    public void ok() {
        super.test100();
        super.test200();
        super.test300();
        //super.test400();
    }

    //访问父类构造器   super() 只能放在构造器的第一句  只能出现一句
    public B() {
        super(1, 1, 1, 1);//访问父类A的四参数构造器
    }


    public void calc2() {
        System.out.println("B类的calc2方法");
    }

    public void sum() {
        System.out.println("B类的sum()");
        //调用父类A的calc方法
        //因为B类没有重名的calc方法，so以下三种方式都可以
        calc();//先找本类 可调用则调用。没有则找父类的
        super.calc();
        this.calc();

        //如果有重名super.calc2 是调用父类的calc2的方法
        calc2();  //B
        super.calc02();//A
        this.calc2();//B
    }

}
