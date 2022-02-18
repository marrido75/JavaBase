/*
 * @Author: Marrido
 * @Date: 2022-02-18 23:23:58
 * @LastEditTime: 2022-02-18 23:30:54
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\Javabase6\TwoArray04YangHui3.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package Javabase6;

public class TwoArray04YangHui3 {
    public static void main(String[] args) {

        // 1
        // 1 2 1
        // 1 3 3 1
        // 1 4 6 4 1
        int[][] arr = new int[10][];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i+1];
            for (int j = 0; j < arr[i].length; j++) {
                if (j==0 || j== arr[i].length-1) {
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
                }

            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
