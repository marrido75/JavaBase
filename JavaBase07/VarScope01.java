/*
 * @Author: Marrido
 * @Date: 2022-02-23 21:57:57
 * @LastEditTime: 2022-02-23 22:32:37
 * @LastEditors: Marrido
 * @Description: 变量作用域
 * @FilePath: \JavaBase\JavaBase07\VarScope01.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class VarScope01 {
    public static void main(String[] args) {
        Cat02 c = new Cat02();
        c.cry();

        // 调用Cat03,输出age
        Cat03 c1 = new Cat03();
        c1.test();// 10

        // 调用Cat04,输出age
        Cat04 c2 = new Cat04();
        c2.test(c);// 10
    }
}

class Cat02 {
    // 全局变量（属性） 作用域是整个类体中
    public int age = 10;// 可直接在 say cry方法中使用
    // 全局变量是可以加修饰符的
    private double weight;// 全局变量可以不赋值有默认值

    public void say() {
        // 1.局部变量一般指在成员方法中定义的变量
        // 2.局部变量必须赋值才能使用，局部变量没有默认值

        // a和name只能在say方法中使用
        int a = 100;
        String name = "moco";
        System.out.println(a);// 局部变量
        System.out.println(name);// 局部变量
        System.out.println(age);// 全局变量
    }

    public void cry() {
        int age = 100;
        System.out.println(age);// 全局变量和局部变量重名，就近原则100
        System.out.println(weight);// 全局变量,有默认值0.0

    }
}

class Cat03 {
    public void test() {
        // 创建对象然后调用另一个类中的全局变量
        Cat02 c = new Cat02();
        System.out.println(c.age);
    }
}

class Cat04 {
    // 直接把Cat02对象传入本方法，然后直接调用cat02中的全局变量
    public void test(Cat02 c) {
        System.out.println(c.age);
    }
}
