/*
 * @Author: Marrido
 * @Date: 2022-02-24 20:51:02
 * @LastEditTime: 2022-02-24 21:05:39
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase07\This03.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class This03 {
    public static void main(String[] args) {
        Person05 p1 = new Person05("大旺", 10);
        Person05 p2 = new Person05("大猫", 10);

        System.out.println("p1和p2比较的结果是" + p1.compareTo(p2));

    }
}

class Person05 {
    String name;
    int age;

    public Person05(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(Person05 p) {
        // if (this.name.equals(p.name) && this.age ==p.age) {
        // return true;
        // }else{
        // return false;
        // }
        return this.name.equals(p.name) && this.age == p.age;
    }

}

class TestPreson {
    String name;
    int age;

    public TestPreson(String name, int age) {
        this.name = name;
        this.age = age;
    }

}