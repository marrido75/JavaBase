package JavaBase;

/*
 * @Author: Marrido
 * @Date: 2022-02-16 21:48:37
 * @LastEditTime: 2022-02-19 11:09:17
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase\C1homework06.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class C1homework06 {
    public static void main(String[] args) {
        // 1+(1+2)+(1+2+3)+...+(1+2+3+...+100)
        int sum = 0;

        for (int j = 1; j <= 100; j++) {
            for (int i = 1; i <= j; i++) {
                sum += i;

            }

        }
        System.out.println("结果是："+sum);
    }
}
