package com.modifier;

public class B {
    public void say(){
        A a = new A();
        System.out.println(a.n1+"\t"+a.n2+"\t"+a.n3); //a.n4 私有的无法访问

        a.setN1();
        a.m2();
        a.m3();
//        a.m4();m4为私有  无法访问
    }




}
