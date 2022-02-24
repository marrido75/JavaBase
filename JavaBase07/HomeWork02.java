/*
 * @Author: Marrido
 * @Date: 2022-02-24 21:38:41
 * @LastEditTime: 2022-02-24 21:57:19
 * @LastEditors: Marrido
 * @Description: 查找字符串在不在数组中
 * @FilePath: \JavaBase\JavaBase07\HomeWork02.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class HomeWork02 {
    public static void main(String[] args) {
        String[] strs = { "你好", "1", "2", "3", "4" };
        A02 a = new A02();
        System.out.println(a.find("你好", strs));
    }
}

class A02 {

    public int find(String str, String[] strs) {
        int index = -1;
        for (int i = 0; i < strs.length; i++) {
            if (str!= null && str.equals(strs[i])) {
                index = i;
            }
        }

        return index;
    }
}