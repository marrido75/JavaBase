package JavaBase;

/*
 * @Author: Marrido
 * @Date: 2022-02-10 20:42:06
 * @LastEditTime: 2022-02-19 11:12:14
 * @LastEditors: Marrido
 * @Description: 逻辑运算符或 || ，  | ， ！a , a^b
 * @FilePath: \JavaBase\JavaBase\Logic02.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class Logic02 {
    public static void main(String[] args) {
        // 短路或 ||
        // 逻辑或 |

        int a = 50;
        if (a > 20 || a > 40) {
            System.out.println("成立");
        }

        if (a > 20 | a > 40) {
            System.out.println("成立");
        }

        // ||条件一成立 条件二就不执行, | 条件一条件二都执行

        // ！取反

        // a^b（逻辑异或）    两边不相等时为真
        boolean b = (10 > 1) ^ (3 < 5);
        System.out.println(b);//False
    }
}
