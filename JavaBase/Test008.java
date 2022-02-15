/*
 * @Author: Marrido
 * @Date: 2022-02-14 20:39:47
 * @LastEditTime: 2022-02-14 21:04:53
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \Java\JavaBase\Test008.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class Test008 {
    public static void main(String[] args) {
        // 打印空心金字塔
        // 先打印一个矩形

        int total = 11;
        for (int i = 1; i <= total; i++) {// i表示层数
            for (int k = 1; k <= total - i; k++) {
                System.out.print(" ");
            }

            // 控制打印每层的*的个数
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (j == 1 || j == i * 2 - 1 || i == total) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            // 每打完一层换行
            System.out.println();
        }
    }
}
