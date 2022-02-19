package JavaBase;

/*
 * @Author: Marrido
 * @Date: 2022-02-10 20:57:42
 * @LastEditTime: 2022-02-19 11:12:52
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase\Test002.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class Test002 {
    public static void main(String[] args) {

        int x = 5;
        int y = 5;
        if (x++ == 6 & ++y == 6) {
            // x = 11;
        }
        // System.out.println(x++ == 6);
        // System.out.println(++y == 6);
        // System.out.println(x + "|" + y);

        // 6 6
        // x++ ==6 true 先取值再自增 为6
        // ++y ==6 false 先自增再取值 7
        // x++ == 6 & ++y == 6 false

        int a = 5, b = 5;
        if (a++ == 6 && b++ == 6) {
            a = 11;
        }
        // System.out.println(a++ ==6);
        System.out.println(a + "|" + b);
        // a 6 b 5
        // a 先比较 为 false,再自增为6
        // 因为是短路与 第一条不成立，后面条件不执行，所以b 为5

        int c = 5;
        int d = 5;
        if (c++ == 5 | ++d == 5) {
            c = 11;
        }
        System.out.println(c + "|" + d);
        // c 11 d 6

        int e = 5, f = 5;
        if (e++ == 5 || ++f == 5) {
            e = 11;
        }
        System.out.println(e + "|" + f);
        // 11 5

        boolean g = true;
        boolean h = false;
        short z = 46;
        if (z++ == 46 && (h = true)) {
            z++;//48
        }

        if ((g = false) || (++z == 49)) {//49
            z++;//50
        }

        System.out.println(z + "|" + g + "|" + h);
        // 50
    }
}
