/*
 * @Author: Marrido
 * @Date: 2022-02-20 22:51:04
 * @LastEditTime: 2022-02-20 22:56:45
 * @LastEditors: Marrido
 * @Description: 1. 同类中的方法调用可以直接调用
                    2. 跨类的方法调用，需要先实例化对象，再调用方法
 * @FilePath: \JavaBase\JavaBase07\Method03.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class Method03 {
    public static void main(String[] args) {
        // 1. 同类中的方法调用可以直接调用
        // 2. 跨类的方法调用，需要先实例化对象，再调用方法
        C c = new C();
        int e = c.m3(1);
        System.out.println(e);
    }
}

class B {
    public int m1(int a) {
        return a;
    }

    public int m2(int a) {
        int b = m1(1);// 同一个类中方法直接调用
        return b;
    }

}

class C {
    public int m3(int c) {
        B b = new B();// 跨类需要创建B对象
        int d = b.m2(c);// 再调用方法
        return d;
    }

}