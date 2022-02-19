package JavaBase;

/*
 * @Author: Marrido
 * @Date: 2022-02-14 22:32:59
 * @LastEditTime: 2022-02-19 11:12:28
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase\Return01.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class Return01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                System.out.println("bug机");
                return;
                // break;
                // continue;
            }
            System.out.println("lallal");
        }
        System.out.println("go on");
    }
}