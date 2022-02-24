/*
 * @Author: Marrido
 * @Date: 2022-02-24 22:09:53
 * @LastEditTime: 2022-02-24 22:24:42
 * @LastEditors: Marrido
 * @Description: 复制一个数组
 * @FilePath: \JavaBase\JavaBase07\HomeWork04.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class HomeWork04 {
    public static void main(String[] args) {
        double[] arr = { 5, 8, 9, 8, 5, 1 };
        A03 a = new A03();
        double[] newArr = a.copyArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(newArr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("原数组"+arr[i]);
        }
    }
}

class A03 {
    public double[] copyArr(double[] arr) {
        double[] arrCopy = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrCopy[i] = arr[i];
        }
        arrCopy[0] = -1;
        return arrCopy;
    }
}