package JavaBase;

/*
 * @Author: Marrido
 * @Date: 2022-02-10 22:18:08
 * @LastEditTime: 2022-02-19 11:12:57
 * @LastEditors: Marrido
 * @Description: 求最大值
 * @FilePath: \JavaBase\JavaBase\Test003.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class Test003 {
    public static void main(String[] args) {

        int a = 55;
        int b = 33;
        int c = 123;
        // int one = a > b ? a : b;
        // int two = one > c ? one : c;

        int max = (c > b ? c : b) > a ? (c > b ? c : b) : a;

        System.out.println("最大值为：" + max);

    }
}
