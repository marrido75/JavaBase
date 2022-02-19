package JavaBase;

/*
 * @Author: Marrido
 * @Date: 2022-02-10 20:19:59
 * @LastEditTime: 2022-02-19 11:12:08
 * @LastEditors: Marrido
 * @Description: 逻辑运算符
 * @FilePath: \JavaBase\JavaBase\Logic.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class Logic {
    public static void main(String[] args) {
        // && 短路与
        int age = 50;
        if (age > 20 && age < 90) {
            System.out.println("成立" + (age > 20 && age < 90));
        }
        // & 逻辑与
        if (age > 20 & age < 90) {
            System.out.println("成立" + (age > 20 & age < 90));
        }

        // 区别
        // 短路与&&,如果第一个条件为假，后面的就不会在做比较，
        // 逻辑与& ，如果第一个条件为假，后面的判断任然会执行！
        int a = 4;
        int b = 9;
        if (a < 1 && ++b < 50) {
            System.out.println("成立");
        }else{
            System.out.println("不成立");
        }

    }
}
