/*
 * @Author: Marrido
 * @Date: 2022-02-23 21:28:26
 * @LastEditTime: 2022-02-23 21:36:30
 * @LastEditors: Marrido
 * @Description: 可变参数
 * @FilePath: \JavaBase\JavaBase07\VarParam.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class VarParam {
    public static void main(String[] args) {
        CalcSums calc = new CalcSums();
        System.out.println(calc.sum(1, 2, 3));
    }
}

class CalcSums {
    // public int sums(int n1, int n2) {
    // return n1 + n2;
    // }

    // public int sums(int n1, int n2, int n3) {
    // return n1 + n2 + n3;
    // }

    // public int sums(int n1, int n2, int n3, int n4) {
    // return n1 + n2 + n3 + n4;
    // }
    // 以上三个方法相同 参数不同

    public int sum(int... nums) {
        int res = 0;
        // 把接收到参数看成是一个一维数组
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res;
    }
}