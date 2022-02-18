/*
 * @Author: Marrido
 * @Date: 2022-02-18 22:30:45
 * @LastEditTime: 2022-02-18 22:39:12
 * @LastEditors: Marrido
 * @Description: 二维数组动态初始化
 * @FilePath: \JavaBase\Javabase6\TwoArray02.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package Javabase6;

public class TwoArray02 {
    public static void main(String[] args) {
        // 二维数组动态初始化

        int[][] arr = new int[2][3];// 2行 3列

        arr[1][1]  = 8;//改变第二个一维数组的第二个
        // 遍历
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
