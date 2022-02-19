package JavaBase;

/*
 * @Author: Marrido
 * @Date: 2022-02-10 20:11:04
 * @LastEditTime: 2022-02-19 11:12:24
 * @LastEditors: Marrido
 * @Description: 关系运算符
 * @FilePath: \JavaBase\JavaBase\Relantional.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class Relantional {
    public static void main(String[] args){

        int a = 9;
        int b = 8;
        System.out.println(a > b);//t
        System.out.println(a < b);//f
        System.out.println(a <= b);//f
        System.out.println(a >= b);//t
        System.out.println(a == b);//f
        System.out.println(a != b);//t
        boolean flag =  a > b;
        System.out.println(flag);



    }
}
