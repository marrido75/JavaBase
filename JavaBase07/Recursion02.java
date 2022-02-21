/*
 * @Author: Marrido
 * @Date: 2022-02-21 22:54:02
 * @LastEditTime: 2022-02-21 22:57:53
 * @LastEditors: Marrido
 * @Description: 阶乘
 * @FilePath: \JavaBase\JavaBase07\Recursion02.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class Recursion02 {
    public static void main(String[] args) {
        T2 t2 = new T2();
        int res= t2.factorial(5);
        System.out.println("res = "+ res);
    }
}

class T2 {
    // 阶乘
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
}