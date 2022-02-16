/*
 * @Author: Marrido
 * @Date: 2022-02-16 22:47:20
 * @LastEditTime: 2022-02-16 22:55:38
 * @LastEditors: Marrido
 * @Description: 数组动态初始化
 * @FilePath: \JavaBase\Javabase6\Array02.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package Javabase6;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {

        // 新建一个数组  并输入数据  然后输出
        double score[] = new double[5];
        Scanner myScanner = new Scanner(System.in);

        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入第"+(i+1)+"个元素的值");
            score[i] = myScanner.nextDouble();
        }

        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }

    }
}
