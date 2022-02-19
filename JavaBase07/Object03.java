/*
 * @Author: Marrido
 * @Date: 2022-02-19 21:21:09
 * @LastEditTime: 2022-02-19 21:37:05
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase07\Object03.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class Object03 {
    public static void main(String[] args) {
        // P1是对象名（对象引用）
        // new Person()这才是真正的对象
        Person p1 = new Person();

        // 对象的默认值

        System.out.println("当前这个人的信息：");
        System.out.println(p1.name + " " + p1.age + " "
                + p1.sal + " " + p1.isPass);
                // null 0 0.0 false
    }
}

class Person {
    // 四个属性
    int age;
    String name;
    double sal;
    boolean isPass;
}