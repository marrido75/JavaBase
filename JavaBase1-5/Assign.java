/*
 * @Author: Marrido
 * @Date: 2022-02-10 21:57:31
 * @LastEditTime: 2022-02-16 22:08:26
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase1-5\Assign.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class Assign {
    public static void main(String[] args) {

        int n1 = 10;
        n1 += 4; // n1=n1+4
        System.out.println(n1);// 14

        byte b = 3;
        b += 2; // b = (byte)(b+2) 强制类型转换
        // b=b+2 通不过

        int m = 10;
        int n = 99;
        int resut = m > n ? m++ : --n;
        System.out.println(resut);
    }
}
