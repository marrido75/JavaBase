/*
 * @Author: Marrido
 * @Date: 2022-02-24 22:49:19
 * @LastEditTime: 2022-02-24 22:53:29
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase07\HomeWork07.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class HomeWork07 {
    public static void main(String[] args) {
        Dog04 d = new Dog04();
        d.show();
    }
}

class Dog04 {
    String name = "大黄";
    String color = "红色";
    int age = 10;

    public void show() {
        System.out.println("名字：" + this.name);
        System.out.println("颜色：" + this.color);
        System.out.println("年龄：" + this.age);
    }
}