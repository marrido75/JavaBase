/*
 * @Author: Marrido
 * @Date: 2022-02-14 20:05:41
 * @LastEditTime: 2022-02-14 20:38:05
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \Java\JavaBase\Test007.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class Test007 {
    public static void main(String[] args) {

        // 99乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
