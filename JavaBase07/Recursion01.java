/*
 * @Author: Marrido
 * @Date: 2022-02-21 22:20:06
 * @LastEditTime: 2022-02-21 22:38:55
 * @LastEditors: Marrido
 * @Description: 递归调用
 * @FilePath: \JavaBase\JavaBase07\Recursion01.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class Recursion01 {
    public static void main(String[] args) {
        T1 t = new T1();
        t.test(5);
        // n = 2
        // n = 3
        // n = 4
        // n = 5
    }

}

class T1 {
    public void test(int n) {
        if (n > 2) {
            test(n - 1);
        }
        System.out.println("n = " + n);
    }
}
