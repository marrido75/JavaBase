/*
 * @Author: Marrido
 * @Date: 2022-02-19 00:20:49
 * @LastEditTime: 2022-02-19 00:48:12
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\Javabase6\C6HomeWork02.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package Javabase6;

public class C6HomeWork02 {
    public static void main(String[] args) {
        // 随机生成10个1-100的数。保存到数组。并倒叙打印、求平均值，
        // 最大最小值的下标。斌查找是否有8

        // 定义一个数组
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println();
        

        int[] arrR = new int[10];
        for (int i = 0; i < arrR.length; i++) {
            arrR[arrR.length - i - 1] = arr[i];
        }

        for (int i = 0; i < arrR.length; i++) {
            System.out.println(arrR[i]);
        }

        for (int i = 0; i < arrR.length; i++) {
            if (arrR[i] == 8) {
                System.out.println("有8");
                break;
            }
            if (i == arrR.length - 1) {
                System.out.println("没有8");
            }
        }
        // int arrR[] = {1,2,1,4.5}
        int max = arrR[0];// 假设最大是arr[0]
        int index = 0;
        for (int i = 0; i < arrR.length; i++) {
            if (max < arrR[i]) {
                max = arrR[i];
                index = i;
            }
        }
        System.out.println("最大值是"+max);

    }
}
