package JavaBase;

/*
 * @Author: Marrido
 * @Date: 2022-02-13 10:36:03
 * @LastEditTime: 2022-02-19 11:13:03
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase\Test004.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class Test004 {
    public static void main(String[] args) {

        System.out.println(-10.4%3);

        int i = 66;
        System.out.println(++i+i);

        String str = "1.99999";
        double d1 = Double.parseDouble(str);
        // double d1 = Double.valueOf(str);
        System.out.println(d1);
    }
}
