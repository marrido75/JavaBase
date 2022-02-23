/*
 * @Author: Marrido
 * @Date: 2022-02-23 21:02:25
 * @LastEditTime: 2022-02-23 21:21:48
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase07\OverLoad02.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class OverLoad02 {
    public static void main(String[] args) {
        Methods01 calc = new Methods01();
        System.out.println(calc.calc02(2) + " " + calc.calc02(2, 3)
                + " " + calc.calc02("啊啊啊啊"));
        System.out.println(calc.toMax(9, 10, 11));
    }
}

// 编写程序，类 Methods 中定义三个重载方法并调用。方法名为 m。
// 三个方法分别接收一个 int 参数、两个 int 参数、一个字符串参数。
// 分别执行平方运算并输出结果， 相乘并输出结果，输出字符串信息。
// 在主类的 main ()方法中分别用参数区别调用三个方法

// 定义三个重载方法 max()，第一个方法，返回两个 int 值中的最大值，
// 第二个方法，返回两个 double 值中的最大值，第三个方法

class Methods01 {
    public int calc02(int a) {
        return a * a;
    }

    public int calc02(int a, int b) {
        return a * b;
    }

    public String calc02(String a) {
        return a;
    }

    public int toMax(int a, int b) {// 判断两个整数中最大值
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public double toMax(double a, double b) {// 判断两个double中最大值
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public double toMax(double a, double b, double c) {// 判断两个double中最大值
        // if (a > b) {
        // if (a > c) {
        // return a;
        // } else {
        // return c;
        // }
        // } else {
        // return b;
        // }

        double max1 = a > b ? a : b;
        max1 = max1 > c ? max1 : c;
        return max1;

    }

}