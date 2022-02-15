/*
 * @Author: Marrido
 * @Date: 2022-02-09 19:49:45
 * @LastEditTime: 2022-02-09 20:15:21
 * @LastEditors: Marrido
 * @Description: 自动类型转换
 * @FilePath: \Java\AutoConvert.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class AutoConvert {
    public static void main(String[] args) {
        int n1 = 'a';
        System.out.println(n1);
        int n2 = 1;
        double d2 = n2 + 1.1;
        System.out.println(d2);

        // byte n5 = 1;
        // byte n6 = 2;
        // byte n7 = n5 + n6;
        // 以上会报错

        byte b4 =1;
        short s3 = 100;
        int g3 = 123;
        double d3= 1.223;
        double s1 = b4 + s3 + g3 +d3;
        System.out.println(s1);
    }
}

//  char int long float double
//  byte short int long flaot double

// 只能将精度低的给精度高的   不能反向

//  byte short char 进行计算时  会自定把精度提升到int
