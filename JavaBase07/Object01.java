/*
 * @Author: Marrido
 * @Date: 2022-02-19 10:39:27
 * @LastEditTime: 2022-02-19 21:10:57
 * @LastEditors: Marrido
 * @Description: 类 对象
 * @FilePath: \JavaBase\JavaBase07\Object01.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class Object01 {
    public static void main(String[] args) {
        // 类 对象
        // OOP面向对象
        // 实例化一个猫
        // 穿件一直买赋值给cat1
        // cat1 cat2就是对象
        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";

        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 100;
        cat2.color = "花色";

        // 怎么使用 访问对象的属性
        System.out.println("第1只猫的信息:" + " " + cat1.name + " "
                + cat1.age + " " + cat1.color);
        System.out.println("第2只猫的信息:" + " " + cat2.name + " "
                + cat2.age + " " + cat2.color);
    }
}

// 定义一个猫类
class Cat {
    String name;
    int age;
    String color;
}