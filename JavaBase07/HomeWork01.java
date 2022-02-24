/*
 * @Author: Marrido
 * @Date: 2022-02-24 21:07:38
 * @LastEditTime: 2022-02-24 21:37:33
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase07\HomeWork01.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class HomeWork01 {
    public static void main(String[] args) {
        double[] arr = { 100, 123, 445666777, 4, 234235, 32.0, 0 };
        A01 a = new A01();
        Double res = a.max(arr);
        if (res != null) {
            System.out.println(res);
        } else {
            System.out.println("输入有误");
        }

    }
}

class A01 {
    // double[] arr;

    // public A01(double[] arr) {
    // this.arr = arr;
    // }
    // Double是一个包装类,返回一个Double对象
    public Double max(double[] arr) {

        if (arr != null && arr.length > 0) {
            double max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }

            return max;
        } else {
            return null;
        }

        // 一维数组冒泡排序
        // 循环出每轮更换的次数
        // int len = arr.length - 1;
        // for (int i = 0; i < len; i++) {// 需要4轮 数组长度-1
        // // 循环把大的值放在后面
        // for (int j = 0; j < len - i; j++) {// 每轮调换的次数递减 len-1
        // double temp;
        // if (arr[j] > arr[j + 1]) {
        // temp = arr[j];// 24
        // arr[j] = arr[j + 1];// 69
        // arr[j + 1] = temp;// 24
        // }
        // }
        // }

        // return arr[arr.length - 1];
    }
}