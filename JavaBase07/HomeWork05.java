/*
 * @Author: Marrido
 * @Date: 2022-02-24 22:26:14
 * @LastEditTime: 2022-02-24 22:36:46
 * @LastEditors: Marrido
 * @Description: 圆半径 周长  面积
 * @FilePath: \JavaBase\JavaBase07\HomeWork05.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class HomeWork05 {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("周长" + c.perimeter(100));
        System.out.println("面积" + c.area(5));

    }
}

class Circle {
    double r;
    double pi = Math.PI;

    public double perimeter(double r) {

        double per = 2 * pi * r;
        return per;
    }

    public double area(double r) {

        double area = pi * r * r;
        return area;
    }
}