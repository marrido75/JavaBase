/*
 * @Author: Marrido
 * @Date: 2022-02-16 23:23:13
 * @LastEditTime: 2022-02-16 23:27:24
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\Javabase6\Array03.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package Javabase6;

public class Array03 {
    public static void main(String[] args) {
        // 创建一个char数组 A-Z 并打印

        char chars[] = new char[26];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char)('A' + i);
        }

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
