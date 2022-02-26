package com.modifier;

public class B {
    public void say(){
        A a = new A();
        System.out.println(a.n1+"\t"+a.n2+"\t"+a.n3); //a.n4 私有的无法访问
    }
}
