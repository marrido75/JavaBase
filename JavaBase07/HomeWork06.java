/*
 * @Author: Marrido
 * @Date: 2022-02-24 22:36:57
 * @LastEditTime: 2022-02-24 22:49:02
 * @LastEditors: Marrido
 * @Description: 加减乘除
 * @FilePath: \JavaBase\JavaBase07\HomeWork06.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class HomeWork06 {
    public static void main(String[] args) {
        Calc03 c = new Calc03();
        c.sum(1, 2);
        c.minus(1, 2);

        c.m2(1, 2);
        Double res = c.mu1(1, 5);
        if (res != null) {
            System.out.println(res);
        } else {
            System.out.println("0不能为除数");
        }
    }
}

class Calc03 {
    double a;
    double b;

    public double sum(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public Double mu1(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            // System.out.println("不能为0");
            return null;
        }

    }

    public double m2(double a, double b) {
        return a * b;
    }
}