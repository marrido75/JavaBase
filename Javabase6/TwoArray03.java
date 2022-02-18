/*
 * @Author: Marrido
 * @Date: 2022-02-18 22:46:41
 * @LastEditTime: 2022-02-18 22:57:45
 * @LastEditors: Marrido
 * @Description: 列数不确定数组
 * @FilePath: \JavaBase\Javabase6\TwoArray03.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package Javabase6;

public class TwoArray03 {
    public static void main(String[] args) {
        // 列数不确定数组
        int[][] arr = new int[5][];//创建一个二维数组，但是只能确定一维数组的个数

        for (int i = 0; i < arr.length; i++) {//遍历Arr每个一维数组
            // 给每个一维数组开空间
            // 如果没给一位数组new ,那么arr[i]就是null
            arr[i] = new int[i + 1];
            // 遍历一维数组，并给一位数组每个元素赋值
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;
            }
        }

        // 遍历
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
