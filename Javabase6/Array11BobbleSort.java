/*
 * @Author: Marrido
 * @Date: 2022-02-17 22:54:47
 * @LastEditTime: 2022-02-17 23:55:24
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\Javabase6\Array11BobbleSort.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package Javabase6;

public class Array11BobbleSort {
    public static void main(String[] args) {
        // [24,69,80,57,13]
        // 第一轮把最大数放在最后
        // 24 69 80 57 13
        // 24 69 80 57 13
        // 24 69 57 80 13
        // 24 69 57 13 80//最大数在最后
        // 第二轮把第二大的数放在倒数第二
        // 24 69 57 13 80
        // 24 57 69 13 80
        // 24 57 13 69 80
        // 第三轮把第三大的数放在倒数第三
        // 24 57 13 69 80
        // 24 13 57 69 80
        // 第4轮把第4大的数放在倒数第4
        // 13 24 57 69 80

        // 冒泡排序
        int[] arr = { 69, 24, 80, 57, 13 };
        // 循环出每轮更换的次数
        int len = arr.length-1;
        for (int i = 0; i < len; i++) {//需要4轮   数组长度-1
            // 循环把大的值放在后面
            for (int j = len; j > i; j--) {//每轮调换的次数递减
                int temp;
                if (arr[len - j] > arr[len - j + 1]) {
                    temp = arr[len - j + 1];//24
                    arr[len - j + 1] = arr[len - j];//69
                    arr[len - j] = temp;//24
                }
            }
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

    }
}
