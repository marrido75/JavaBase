/*
 * @Author: Marrido
 * @Date: 2022-02-18 23:37:17
 * @LastEditTime: 2022-02-19 00:19:13
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\Javabase6\C6HomeWork01.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package Javabase6;

public class C6HomeWork01 {
    public static void main(String[] args) {
        int[] arr = { 10, 12, 45, 90 };

        int insertNum = 23;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (insertNum <= arr[i]) {//找出数要插入的下标
                index = i;
                break;
            }
        }
        if (index == -1) {//如果没进入循环  说明数最大，放在最后面
            index = arr.length;
        }

        // 扩容
        int[] arrNew = new int[arr.length + 1];//开辟一个新数组并扩容
        for (int i = 0, j = 0; i < arrNew.length; i++) {
            if (i != index) {//i!=j时。把原来的数写入新数组
                arrNew[i] = arr[j];
                j++;
            } else {//当i=j时，到达需要插入的位置并赋值
                arrNew[i] = insertNum;
            }
        }

        for (int i = 0; i < arrNew.length; i++) {
            System.out.println(arrNew[i]);
        }

        // int[] arrNew = new int[arr.length + 1];

        // for (int i = 0; i < arr.length; i++) {
        // arrNew[i] = arr[i];
        // }

        // arrNew[arrNew.length - 1] = 23;

        // arr = arrNew;

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        // // 冒泡排序
        // // {10 12 45 90 23}

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length - i - 1; j++) {
        // int temp = 0;
        // if (arr[j] > arr[j + 1]) {
        // temp = arr[j + 1];
        // arr[j + 1] = arr[j];
        // arr[j] = temp;
        // }
        // }
        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }
    }
}
