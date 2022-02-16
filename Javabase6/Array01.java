package Javabase6;

/*
 * @Author: Marrido
 * @Date: 2022-02-16 22:19:04
 * @LastEditTime: 2022-02-16 22:46:40
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\Javabase6\Array01.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class Array01 {
    public static void main(String[] args) {
        // 3 5 1 3.4 2 50 平均数
        // 传统方法
        // double hen1 = 3;
        // double hen2 = 5;
        // double hen3 = 1;
        // double hen4 = 3.4;
        // double hen5 = 2;
        // double hen6 = 50;
        // double avgWeight = (hen1+hen2+hen3+hen4+hen5+hen6)/6;

        // 数组
        double[] hens = { 3, 5, 1, 3.4, 2, 50, 123 };
        System.out.println("数组长度：" + hens.length);

        // 遍历数组的所有元素的和；
        // 第一个元素 hens[0] 第一个元素从0开始
        double sum = 0;
        for (int i = 0; i < hens.length; i++) {
            sum += hens[i];
        }
        System.out.println("总体重" + sum + "avg" + sum / hens.length);
    }
}