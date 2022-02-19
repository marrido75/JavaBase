package JavaBase;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

/*
 * @Author: Marrido
 * @Date: 2022-02-13 12:19:39
 * @LastEditTime: 2022-02-19 11:11:05
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase\If03.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class If03 {
    public static void main(String[] args) {
        double d1 = 33.5;
        double d2 = 2.6;

        if (d1 > 10.0 && d2 < 20.0) {
            System.out.println("两个数的为：" + (d1 + d2));
        }

        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;

        // sum能被3和5整除
        if (sum % 3 == 0 && sum % 5 == 0) {
            System.out.println("可以");
        } else {
            System.out.println("不行");
        }

        // 判断是否为闰年    符合以下之一
        // 1.能被4整除，且不能被100整除
        // 2.能被400整除
        Scanner inputYear = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = inputYear.nextInt();
        // if(year%4==0 && year%100 !=0){
        //     System.out.println(year + "是闰年");
        // }else{
        //     if(year%400 == 0){
        //         System.out.println(year + "是闰年");
        //     }else{
        //         System.out.println(year + "不是闰年");
        //     }
        // }

        if((year%4==0 && year%100 !=0) || year%400 ==0){
            System.out.println(year + "是闰年");
        }else{
            System.out.println(year + "不是闰年");
        }


    }
}
