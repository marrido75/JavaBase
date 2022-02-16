/*
 * @Author: Marrido
 * @Date: 2022-02-16 21:40:14
 * @LastEditTime: 2022-02-16 21:46:30
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase\C1homework05.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class C1homework05 {
    public static void main(String[] args) {
        // 1-1/2+1/3-1/4-...-1/100
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += (1.0 / i);// 分子需要改成1.0
            } else {
                sum -= (1.0 / i);
            }
        }
        System.out.println(sum);
    }
}
