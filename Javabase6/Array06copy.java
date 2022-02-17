/*
 * @Author: Marrido
 * @Date: 2022-02-17 21:30:05
 * @LastEditTime: 2022-02-17 21:41:33
 * @LastEditors: Marrido
 * @Description: 数组拷贝
 * @FilePath: \JavaBase\Javabase6\Array06copy.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package Javabase6;

public class Array06copy {
    public static void main(String[] args) {

        // 将arr1拷贝到arr2
        int arr1[] = { 10, 20, 30 };

        // 创建一个新数组arr2 开辟一个新的数据空间
        // 长度为arr1.length

        int arr2[] = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
        }

        arr2[0] = 100;

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }//arr1

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }//arr2
        // 改变arr2后 并未影响到arr1

    }
}
