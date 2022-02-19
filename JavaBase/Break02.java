package JavaBase;

/*
 * @Author: Marrido
 * @Date: 2022-02-14 21:15:51
 * @LastEditTime: 2022-02-19 11:09:44
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase\Break02.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class Break02 {
    public static void main(String[] args) {
        // 
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("i="+i);
        }
    }
}
