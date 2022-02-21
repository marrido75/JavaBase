/*
 * @Author: Marrido
 * @Date: 2022-02-21 21:50:27
 * @LastEditTime: 2022-02-21 22:10:10
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase07\MethodCopy02.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class MethodCopy02 {
    public static void main(String[] args) {
        // 先实例化Dog对象
        Dog dog = new Dog();
        // 克隆Dog对象
        DogClone dog2 = new DogClone();

        //  创建d2用来调用
        Dog d2 = dog2.dogClone(dog);

        d2.name = "大黄";
        d2.age = 3;

        System.out.println("dogclone "+d2.age);
    }
}

class Dog {
    int age;
    String name;

    public void eat() {
        System.out.println("狗在吃饭！");
    }
}

// 克隆Dog类

class DogClone {
    public Dog dogClone(Dog d) {
        // 创建对象
        Dog dog2 = new Dog();
        // 赋值赋值
        dog2.age = d.age;
        dog2.name = d.name;
        // 返回
        return dog2;
    }
}