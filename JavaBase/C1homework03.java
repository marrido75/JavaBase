package JavaBase;




/*
 * @Author: Marrido
 * @Date: 2022-02-16 21:25:55
 * @LastEditTime: 2022-02-19 11:09:32
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase\C1homework03.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class C1homework03 {
    public static void main(String[] args) {
        // 输出1-100不能被5整除的数 每5个一行
        // 1. 输出1-100
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if(i%5!=0){
                count++;
                System.out.print(i+"\t");
                // 满5个换行
                if(count%5==0){
                    System.out.println();
                }
            }
        }
    }
}