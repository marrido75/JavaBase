package JavaBase;

/*
 * @Author: Marrido
 * @Date: 2022-02-14 22:23:36
 * @LastEditTime: 2022-02-19 11:10:12
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase\Continue02.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class Continue02 {
    public static void main(String[] args) {
        for (int j = 0; j < 4; j++) {
            label: for (int i = 0; i < 10; i++) {
                if (i == 2) {
                    continue label;
                }
            }
        }
    }
}
