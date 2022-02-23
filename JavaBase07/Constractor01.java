/*
 * @Author: Marrido
 * @Date: 2022-02-23 22:39:13
 * @LastEditTime: 2022-02-23 22:52:20
 * @LastEditors: Marrido
 * @Description: 构造器
 * @FilePath: \JavaBase\JavaBase07\Constractor01.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class Constractor01 {
    public static void main(String[] args) {

        // Cperson cp = new Cperson("jack");
        // System.out.println(cp.name+" "+cp.age);

        Cperson cp = new Cperson("大黄",10);
        System.out.println(cp.name+" "+cp.age);
    }
}

class Cperson {
    String name;
    int age;

    // 构造器
    public Cperson(String pNmae, int pAge) {
        System.out.println("构造器1被调用");
        name = pNmae;
        age = pAge;
    }

    // 构造器重载
    public Cperson(String pNmae) {
        System.out.println("构造器2被调用");
        name = pNmae;
    }
}