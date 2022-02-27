package com.modifier;

public class A {

    public int n1 = 100; //都可以访问
    protected int n2 = 200; //本包可以访问
    int n3 = 300;   //同类同包可以
    private int n4 = 400;

    public void setN1() {
        System.out.println(n1 + "\t" + n2 + "\t" + n3 + "\t" + n4);
    }

    protected void m2(){}
    void m3(){}
    private void m4(){}
    public void hi(){
        setN1();
        m2();
        m3();
        m4();
    }
}


