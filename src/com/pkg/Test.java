package com.pkg;

import com.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        //n1 n2 n3 不同包只有public可以访问，其它都无法使用
        System.out.println(a.n1);

        a.setN1();  //public
//        a.m2();   不同包 只有public可以访问
//        a.m3();   不同包 只有public可以访问
//        a.m4();   不同包 只有public可以访问
    }
}
