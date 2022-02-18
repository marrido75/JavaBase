/*
 * @Author: Marrido
 * @Date: 2022-02-18 23:03:42
 * @LastEditTime: 2022-02-18 23:21:47
 * @LastEditors: Marrido
 * @Description: 杨辉三角
 * @FilePath: \JavaBase\Javabase6\TwoArray03YangHui3.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package Javabase6;

public class TwoArray03YangHui3 {
    public static void main(String[] args) {
        // 1
        // 1 1
        // 1 2 1
        // 1 3 3 1
        // 1 4 6 6 4 1
        // 1 5 10 10 5 1

        int[][] yangHui = new int[10][];
        for (int i = 0; i < yangHui.length; i++) {//遍历杨辉的每个元素
            yangHui[i] = new int[i + 1];//给每行开空间
            // 给每一行赋值
            for (int j = 0; j < yangHui[i].length; j++) {
                //每一行的第一个元素和最后一个都是1
                if (j == 0 || j == yangHui[i].length - 1) {
                    yangHui[i][j] = 1;

                } else {//中间元素等于上面一个元素+上面元素-1
                    yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
                }
            }

        }

        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j]+" ");
            }
            System.out.println();
        }
    }
}
