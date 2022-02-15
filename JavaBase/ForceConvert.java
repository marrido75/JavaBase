/*
 * @Author: Marrido
 * @Date: 2022-02-09 20:16:37
 * @LastEditTime: 2022-02-09 20:26:01
 * @LastEditors: Marrido
 * @Description: 基本数据+强制转换
 * @FilePath: \Java\ForceConvert.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class ForceConvert {
    public static void main(String[] args) {
        int i = (int) 1.999999999;
        System.out.println(i);

        int n = 9999;
        byte b = (byte) n;
        System.out.println(b);
        // 以上数据强制转换后 数据错误

        int x = (int) (10 * 1.1 / 2.2);
        System.out.println(x);

        char c1 = 100;
        int m = 100;
        char c3 = (char)m;
        System.out.println(c3);
    }
}