/*
 * @Author: Marrido
 * @Date: 2022-02-16 23:28:50
 * @LastEditTime: 2022-02-16 23:46:22
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\Javabase6\Array04.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package Javabase6;

public class Array04 {
    public static void main(String[] args) {
        // 求数组的最大值和下标
        // int a[] = {4,-1,9,10,23}
        int a[] = { 40, -1, -23, 9, 10 };
        int max = a[0];// 假设第一个值是最大值
        int n = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];// 如果获取的元素大于max 就把该元素设置成最大值
                n = i;// 并设置下标
            }
        }
        System.out.println(max + "---" + n);
    }
}
