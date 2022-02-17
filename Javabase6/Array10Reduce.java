/*
 * @Author: Marrido
 * @Date: 2022-02-17 22:24:26
 * @LastEditTime: 2022-02-17 22:49:05
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\Javabase6\Array10Reduce.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package Javabase6;

import java.util.Scanner;

public class Array10Reduce {
    public static void main(String[] args) {
        // 缩减数组元素 剩余一个元素时提示不能再缩减
        Scanner myScanner = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5 };

        do {
            System.out.println("是否缩减数组元素？ y/n");
            char isReduce = myScanner.next().charAt(0);
            if (isReduce == 'y' && (arr.length - 2) >= 0) {

                int arrNew[] = new int[arr.length - 1];
                for (int i = 0; i < arrNew.length; i++) {
                    arrNew[i] = arr[i];
                }

                arr = arrNew;
                System.out.println("arr剩余元素个数：" + arr.length);
            } else {
                if (arr.length == 1) {
                    System.out.println("只剩余一个元素不能再缩减了");
                }
                break;
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

        } while (true);
    }
}
