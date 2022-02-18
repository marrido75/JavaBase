/*
 * @Author: Marrido
 * @Date: 2022-02-18 22:16:00
 * @LastEditTime: 2022-02-18 22:28:11
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\Javabase6\TwoArray01.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package Javabase6;

public class TwoArray01 {
    public static void main(String[] args) {
        // 二维数组
        int[][] arr = {
                { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 0, 0 },
                { 0, 2, 0, 3, 0, 0 },
                { 0, 0, 0, 0, 0, 0 }
        };

        //遍历二维数组的每个元素（一维数组）
        for (int i = 0; i < arr.length; i++) {
            //遍历二维数组中的每个元素（一维数组）
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // 数组访问  arr[i][j]
        System.out.println(arr[2][3]);//
    }
}