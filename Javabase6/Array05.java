/*
 * @Author: Marrido
 * @Date: 2022-02-16 23:50:09
 * @LastEditTime: 2022-02-17 00:02:04
 * @LastEditors: Marrido
 * @Description: 数组赋值机制
 * @FilePath: \JavaBase\Javabase6\Array05.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package Javabase6;

public class Array05 {
    public static void main(String[] args) {
        // 基础数据类型赋值
        // 赋值方式为值拷贝,n2变化不会影响n1
        int n1 = 10;
        int n2 = n1;

        n2 = 80;
        System.out.println(n1);//10
        System.out.println(n2);//80

        // 数组默认是引用传递，赋值是地址，赋值方式是引用赋值
        // 是一个地址，arr2会影响到arr1
        int arr1[] = { 1, 2, 3 };
        int arr2[] =arr1;
        arr2[2] = 10;

        System.out.println("arr1的元素是：");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);// 1.2.10
        }
    }
}
