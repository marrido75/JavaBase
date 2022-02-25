/*
 * @Author: Marrido
 * @Date: 2022-02-25 20:00:55
 * @LastEditTime: 2022-02-25 20:14:46
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase07\HomeWork12.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class HomeWork12 {
    public static void main(String[] args) {

    }
}

class Employee {
    String name;
    char gender;
    int age;
    String jobs;
    double pay;

    // 名字 性别 年龄 工作 薪水
    public Employee(String name, char gender, int age, String jobs, double pay) {
        // this.name = name;
        // this.gender = gender;
        // this.age = age;
        // this.jobs = jobs;
        // this.pay = pay;
        this(name, gender, age);// 调用构造器
        this.jobs = jobs;
        this.pay = pay;

    }

    // 名字 性别 年龄
    public Employee(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // 工作 薪水
    public Employee(String jobs, double pay) {
        this.jobs = jobs;
        this.pay = pay;
    }
}
