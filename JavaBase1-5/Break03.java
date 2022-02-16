/*
 * @Author: Marrido
 * @Date: 2022-02-14 21:28:38
 * @LastEditTime: 2022-02-14 21:36:41
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \Java\JavaBase\Break03.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class Break03 {
    public static void main(String[] args) {
        // 1-100求和 第一次大于20的当前数
        int sum = 0;
        int n = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
            if (sum > 20) {
                n = i;
                break;
            }
        }
        System.out.println("和>20的当前数是：" + n);

    }
}
