/*
 * @Author: Marrido
 * @Date: 2022-02-18 23:00:55
 * @LastEditTime: 2022-02-18 23:02:20
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\Javabase6\TwoArray03Test.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package Javabase6;

public class TwoArray03Test {
    public static void main(String[] args) {
        // 

        int[][] arr = {
            {1,2,3},
            {1,4,5,7},
            {-2}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
