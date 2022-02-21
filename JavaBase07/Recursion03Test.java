/*
 * @Author: Marrido
 * @Date: 2022-02-21 23:16:57
 * @LastEditTime: 2022-02-21 23:28:21
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase07\Recursion03Test.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class Recursion03Test {
    public static void main(String[] args) {
        T3 t = new T3();
        int fbl = t.Fib(7);
        System.out.println("菲波拉契数是" + fbl);
    }
}

class T3 {
    /**
     * 使用递归求出斐波那契数 1.1.2.3.5.8.13....
     * 给一个整数N 求出值
     */
    public int Fib(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return Fib(n - 1) + Fib(n - 2);
            }
        } else {
            System.out.println("要求输入的数>1的整数");
            return -1;
        }
    }
}
