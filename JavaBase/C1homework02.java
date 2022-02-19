package JavaBase;


/*
 * @Author: Marrido
 * @Date: 2022-02-15 19:00:18
 * @LastEditTime: 2022-02-19 11:09:34
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase\C1homework02.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
// import java.util.Scanner;

public class C1homework02 {
    public static void main(String[] args) {
        // 判断一个整数是否为水仙花数
        // 153 = 1*1*1+3*3*3+5*5*5;

        // Scanner myScanner = new Scanner(System.in);
        // System.out.println("请输入一个整数：");
        // int num = myScanner.nextInt();

        // 思路分析
        // int n = 153;
        // 百位 n/100
        // 十位 n%100/10
        // 个位 n%10
        int n = 153;
        int n1 = n / 100;
        int n2 = n % 100 / 10;
        int n3 = n % 10;
        if (n1*n1*n1+n2*n2*n2+n3*n3*n3 == n) {
            System.out.println("是");
        } else {
            System.out.println("不是");
        }

    }
}