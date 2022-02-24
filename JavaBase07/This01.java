/*
 * @Author: Marrido
 * @Date: 2022-02-24 19:41:24
 * @LastEditTime: 2022-02-24 20:23:28
 * @LastEditors: Marrido
 * @Description: this关键字
 * @FilePath: \JavaBase\JavaBase07\This01.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class This01 {
    public static void main(String[] args) {
        Dog03 d1 = new Dog03("大壮", 3);
        d1.info();// 大壮 3
        System.out.println(d1.hashCode());

        Dog03 d2 = new Dog03("大黄", 2);
        d2.info();// 大黄 2
        System.out.println(d2.hashCode());
    }
}

class Dog03 {
    String name;
    int age;

    // 构造器
    public Dog03(String name, int age) {
        // this.name就是当前对象的name属性（全局变量）
        this.name = name;
        this.age = age;
    }

    // 如果构造器的形参能够直接写成属性名就更好了。
    //

    // info成员方法
    public void info() {
        // 输出对象的属性信息
        System.out.println(name + " " + age);
        System.out.println(this.hashCode());
    }
}