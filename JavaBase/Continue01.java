/*
 * @Author: Marrido
 * @Date: 2022-02-14 22:09:01
 * @LastEditTime: 2022-02-14 22:23:25
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \Java\JavaBase\Continue01.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class Continue01 {
    public static void main(String[] args) {
        //
        int i = 1;
        while (i <= 4) {
            i++;
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }
        // 3 4 5

    }
}