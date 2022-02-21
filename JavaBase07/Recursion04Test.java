/*
 * @Author: Marrido
 * @Date: 2022-02-21 23:28:30
 * @LastEditTime: 2022-02-22 00:01:35
 * @LastEditors: Marrido
 * @Description: 猴子吃桃
 * @FilePath: \JavaBase\JavaBase07\Recursion04Test.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class Recursion04Test {
    public static void main(String[] args) {
        T4 t = new T4();
        int day = 1;
        int peachNum = t.peach(day);
        if (peachNum != -1) {
            System.out.println("第" + day + "天有" + peachNum + "个桃子");
        }
    }
}

class T4 {
    public int peach(int day) {
        /**
         * 有一堆桃子，第一天吃了其中的一半，并再多吃一个。
         * 以后每一天都吃其中一半，再多吃一个。
         * 当到第10天时，发现只有一个桃子。
         * 问最初有多少个桃子

         * 第10天 1
         * 第9天 (day9+1)*2 = 4
         * 第8天 (day8+1)*2 = 20
         */
        // n/2-1 =1
        if (day == 10) {
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (peach(day + 1) + 1) * 2;
        } else {
            System.out.println("day要在1-10");
            return -1;
        }
    }
}