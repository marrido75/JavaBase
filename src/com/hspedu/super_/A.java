package com.hspedu.super_;

import com.modifier.B;

public class A extends Base {

    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public A(){

    }

    public A(int n1, int n2, int n3, int n4) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }

    public void calc(){
        System.out.println("A类的calc方法");
    }

    //public void calc2(){
    //    System.out.println("A类的calc2方法");
    //}

    public void test100() {
    }

    protected void test200() {
    }

    void test300() {
    }

    private void test400() {
    }

}


