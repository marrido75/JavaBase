/*
 * @Author: Marrido
 * @Date: 2022-02-21 23:42:24
 * @LastEditTime: 2022-02-22 00:00:47
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase07\Recursion05Test.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class Recursion05Test {
    /**
     * 有一堆桃子，第一天吃了其中的一半，并再多吃一个。
     * 以后每一天都吃其中一半，再多吃一个。
     * 当到第10天时，发现只有一个桃子。
     * 问最初有多少个桃子
     */

    /**
     * 第10天 1
     * 第9天 (day9+1)*2 = 4
     * 第8天 (day8+1)*2 = 20
     */
    // n/2-1 =1

    public static void main(String[] args) {
        EatPeach eatP = new EatPeach();
        int day = 8;
        int num = eatP.peach(day);
        System.out.println("第"+day+"天有"+num+"个桃子");
    }

}

class EatPeach {
    public int peach(int day) {
        if (day == 10) {
            return 1;
        } else if (day >= 1 && day < 10) {
            return (peach(day + 1) + 1) * 2;
        } else {
            System.out.println("天数错误");
            return -1;
        }
    }
}