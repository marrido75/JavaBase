/*
 * @Author: Marrido
 * @Date: 2022-02-20 23:20:39
 * @LastEditTime: 2022-02-20 23:49:00
 * @LastEditors: Marrido
 * @Description: 基础数据类型   形参变量改变不会影响实参的变量
 * @FilePath: \JavaBase\JavaBase07\MethodParam01.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class MethodParam01 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        A1 obj = new A1();
        obj.swap(a, b);
        System.out.println("a=" + a + " b=" + b);//10 20
    }
}

class A1 {
    public void swap(int a, int b) {
        System.out.println("a和b交换前的值" + a + " " + b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("a和b交换后的值" + a + " " + b);
    }
}

// 10 20
//