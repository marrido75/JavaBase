/*
 * @Author: Marrido
 * @Date: 2022-02-21 21:25:18
 * @LastEditTime: 2022-02-21 21:49:03
 * @LastEditors: Marrido
 * @Description: 克隆对象
 * @FilePath: \JavaBase\JavaBase07\MethodCopy01.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class MethodCopy01 {
    public static void main(String[] args) {
        // 编写一个copyPerson,可以赋值Person对象,
        // 返回赋值的对象。克隆对象。注意得到的新对象和
        // 原来的对象是两个独立的对象，只是他们属性相同

        Person2 p = new Person2();
        p.a = 100;

        // 创建MyTools对象
        MyTools tools = new MyTools();
        Person2 p2 = tools.copyPerson(p);
        // 到此 p 和 p2是Person对象，但是是两个独立的对象
        // 属性相同

        System.out.println(p.a);//100
        System.out.println(p2.a);//100

        System.out.println(p == p2);//false
    }
}

class Person2{
    int a;
    double b;
    public void person() {
        System.out.println(" 111");
    }
}

class MyTools{

    public Person2 copyPerson(Person2 p) {
        // 创建一个对象
        Person2 p2 = new Person2();
        p2.a = p.a;//把原来对象的a 克隆到新的对象中

        return p2;
    }
}
