/*
 * @Author: Marrido
 * @Date: 2022-02-17 21:59:46
 * @LastEditTime: 2022-02-17 22:08:46
 * @LastEditors: Marrido
 * @Description: 数组元素添加
 * @FilePath: \JavaBase\Javabase6\Array08Add.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package Javabase6;

public class Array08Add {
    public static void main(String[] args) {
        // 数组添加元素
        int arr[] = { 1, 2, 3 };
        // arr[3]=4; 报错 下标越界
        int arrNew[] = new int[arr.length + 1];
        // 遍历arr 拷贝到 arrNew
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }

        arrNew[arrNew.length - 1] = 4;

        arr = arrNew;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
