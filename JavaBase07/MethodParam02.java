/*
 * @Author: Marrido
 * @Date: 2022-02-20 23:49:11
 * @LastEditTime: 2022-02-20 23:57:14
 * @LastEditors: Marrido
 * @Description: 引用类型的变量， 形参的改变 实参也会改变
 * @FilePath: \JavaBase\JavaBase07\MethodParam02.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class MethodParam02 {
    public static void main(String[] args) {
        // 引用类型的变量， 形参的改变 实参也会改变
        B1 b = new B1();
        int[] arr = { 1, 2, 3 };
        System.out.println("main");
        b.test1000(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "\t");
        }
    }
}

class B1 {
    public void test1000(int[] arr) {
        arr[0] = 200;//引用数据类型的值改变了。使用的是同一个地址。所以arr改变了
        System.out.println("test100");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "\t");
        }
    }
}