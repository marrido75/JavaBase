/*
 * @Author: Marrido
 * @Date: 2022-02-17 21:47:12
 * @LastEditTime: 2022-02-17 21:53:47
 * @LastEditors: Marrido
 * @Description: 数组反转
 * @FilePath: \JavaBase\Javabase6\Array07.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package Javabase6;

public class Array07 {
    public static void main(String[] args) {
        // 数组反转
        int arr[] = { 11, 22, 33, 44, 55, 66 };
        //建一个空数组
        int arrR[] = new int[arr.length];
        // 新数组按原数组倒叙写入新数组
        for (int i = 0; i < arrR.length; i++) {
            arrR[arrR.length - 1 - i] = arr[i];
        }

        for (int i = 0; i < arrR.length; i++) {
            System.out.println(arrR[i]);
        }//  66 55 44 33 22 11




    }
}