/*
 * @Author: Marrido
 * @Date: 2022-02-23 23:09:36
 * @LastEditTime: 2022-02-23 23:17:42
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase07\Constractor02.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class Constractor02 {
    public static void main(String[] args) {

        Dog02 p = new Dog02();
        System.out.println(p.age+" "+p.name);

        Dog02 p1 = new Dog02("小王",100);
        System.out.println(p1.age+" "+p1.name);
    }
}

class Dog02 {
    String name;
    int age;

    // 定义一个无参构造器 让age初始值为18
    Dog02(){
        age = 18;
    }

    // 定义一个有参数构造器  
    public Dog02(String pName,int pAge){
        name = pName;
        age = pAge;
    }
}