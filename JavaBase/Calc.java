/*
 * @Author: Marrido
 * @Date: 2022-02-10 19:13:52
 * @LastEditTime: 2022-02-10 19:46:57
 * @LastEditors: Marrido
 * @Description: 运算符
 * @FilePath: \Java\Calc.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class Calc {
    public static void main(String[] args) {
        System.out.println(10.0 / 4);

        double d = 10 / 4;
        System.out.println(d);
        // 以上会输出2.0 10/2 在java中是2 给double会变成2.0

        System.out.println(10 % 3);
        System.out.println(-10 % 3);
        System.out.println(10 % -3);
        // a % b = a - a / b * b

        int i = 10;
        i++;
        ++i;
        System.out.println("i = "+ i);
        // 作为独立语句使用 都是i= i+1

        int j = 8;
        int k = ++j;
        System.out.println(j);//9
        System.out.println(k);//9

        int m = 8;
        int n = m++;
        System.out.println(m);//8
        System.out.println(n);//9

        // i++ 是先赋值再自增
        // ++i  是先自增再赋值

        int i1 = 1;
        i1 = i1++;
        System.out.println(i1);

        int i2 = 1;
        i2 = ++ i2;
        System.out.println(i2);

        //(1) 1. temp = i 2. i=i+1    3. i= temp
        //(2) 1. i=i+1    2. temp =i  3. i= temp


    }
}
