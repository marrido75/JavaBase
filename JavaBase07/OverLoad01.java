/*
 * @Author: Marrido
 * @Date: 2022-02-23 20:39:18
 * @LastEditTime: 2022-02-23 20:51:30
 * @LastEditors: Marrido
 * @Description: 方法重载
 * @FilePath: \JavaBase\JavaBase07\OverLoad01.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class OverLoad01 {
    public static void main(String[] args) {
        /**
         * 方法重载
         */
        MyCalc calc = new MyCalc();
        int a = calc.calcSum(1, 1);
        double b = calc.calcSum(1, 1.1);
        double c = calc.calcSum(1.1, 1);
        int d = calc.calcSum(1, 1, 1);
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}

class MyCalc {

    // 形参不一样  方法名相同
    public int calcSum(int a, int b) {
        return a + b;
    }

    public double calcSum(int a, Double b) {
        return a + b;
    }

    public double calcSum(double a, int b) {
        return a + b;
    }

    public int calcSum(int a, int b, int c) {
        return a + b + c;
    }
}