/*
 * @Author: Marrido
 * @Date: 2022-02-18 21:48:17
 * @LastEditTime: 2022-02-18 22:13:55
 * @LastEditors: Marrido
 * @Description: 数组数据查找
 * @FilePath: \JavaBase\Javabase6\ArraySearch01.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package Javabase6;

import java.util.Scanner;

public class ArraySearch01 {
    public static void main(String[] args) {
        // 查找数组中是否有你要的元素

        // 定义一个字符串数组
        String[] names = { "一", "二", "三", "四" };
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入如名字：");
        String inputName = myScanner.next();
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if (inputName.equals(names[i])) {
                System.out.println("数组中有您查找的元素，下标是：" + i);
                index = i;
                break;
            }
        }

        if (index == -1) {// 如果值没有改变 说明没有进入到for循环，就没有找到一样的值
            System.out.println("没有您查找的元素");
        }
    }
}
