/*
 * @Author: Marrido
 * @Date: 2022-02-25 19:47:16
 * @LastEditTime: 2022-02-25 19:58:11
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase07\HomeWork11.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class HomeWork11 {
    public static void main(String[] args) {
        new A04().test03();
    }
}

class A04 {
    public double method(double a, double b) {
        return a + b;
    }

    
    public void test03() {
        System.out.println(method(method(10.0, 20.0), 100));
    }
}
