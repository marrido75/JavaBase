/*
 * @Author: Marrido
 * @Date: 2022-02-16 21:33:17
 * @LastEditTime: 2022-02-16 21:38:48
 * @LastEditors: Marrido
 * @Description: 输出a-z Z-A
 * @FilePath: \JavaBase\JavaBase\C1homework04.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class C1homework04 {
    public static void main(String[] args) {
        // 输出a-z Z-A
        // a =97  b=98
        for (char c1 = 'a'; c1 <= 'z'; c1++) {
            System.out.println(c1);
        }

        for (char c1 = 'Z'; c1 >= 'A'; c1--) {
            System.out.println(c1);
        }
    }
}
