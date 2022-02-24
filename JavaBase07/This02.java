/*
 * @Author: Marrido
 * @Date: 2022-02-24 20:29:45
 * @LastEditTime: 2022-02-24 20:50:06
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase07\This02.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class This02 {
    public static void main(String[] args) {
        Test03 t = new Test03();
        t.f2();


    }
}

class Test03 {
    int age = 10;

    // this访问构造器
    public Test03() {
        this("大旺", 100);// this访问构造器必须放在第一天语句
        System.out.println("构造器T1");

    }

    public Test03(String name, int age) {
        System.out.println("构造器T2");
    }

    public void f1() {
        int age = 11;
        System.out.println("调用f1方法" + age);
        System.out.println("调用f1方法" + this.age);
    }

    public void f2() {
        // 调用本类f1\
        // 1.
        // f1();
        // 2.
        this.f1();
    }
}