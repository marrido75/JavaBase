/*
 * @Author: Marrido
 * @Date: 2022-02-17 22:10:23
 * @LastEditTime: 2022-02-17 22:19:05
 * @LastEditors: Marrido
 * @Description: 接收用户输入的值，动态添加数组
 * @FilePath: \JavaBase\Javabase6\Array09Add.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package Javabase6;

import java.util.Scanner;

public class Array09Add {
    public static void main(String[] args) {
        // 接收用户输入的值，动态添加数组

        Scanner myScanner = new Scanner(System.in);

        // 数组添加元素
        int arr[] = { 1, 2, 3 };

        do{
            // arr[3]=4; 报错 下标越界
            int arrNew[] = new int[arr.length + 1];
            // 遍历arr 拷贝到 arrNew
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            System.out.println("请输入要添加的元素：");
            int addNum = myScanner.nextInt();

            arrNew[arrNew.length - 1] = addNum;

            arr = arrNew;

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

            System.out.println("是否继续添加？ y/n");
            char isAdd = myScanner.next().charAt(0);
            if (isAdd != 'y') {
                break;
            }

        }while(true);

    }
}
