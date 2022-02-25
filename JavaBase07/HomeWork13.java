/*
 * @Author: Marrido
 * @Date: 2022-02-25 20:15:54
 * @LastEditTime: 2022-02-25 20:37:25
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase07\HomeWork13.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class HomeWork13 {
    public static void main(String[] args) {
        Circle02 c = new Circle02();
        new PassOblect().printAreas(c, 10);
    }
}

// Radius  Area
// 1       3.141592653589793
// 2       12.566370614359172
// 3       28.274333882308138
// 4       50.26548245743669
// 5       78.53981633974483

class Circle02 {
    double r;

    // 返回圆的面积
    public double findArea(double r) {
        return Math.PI * r * r;
    }
}

class PassOblect {
    public void printAreas(Circle02 c, int times) {
        System.out.println("Radius" + "\t" + "Area");
        for (int i = 1; i <= times; i++) {
            System.out.println((double)i + "\t" + c.findArea(i));
        }
    }
}