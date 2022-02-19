package JavaBase;

import java.util.Scanner;

/*
 * @Author: Marrido
 * @Date: 2022-02-13 19:48:59
 * @LastEditTime: 2022-02-19 11:10:14
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase\DoWhile05.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class DoWhile05 {
    public static void main(String[] args) {

        // 如果李三不还钱，老韩就一直使出五连鞭，直到还钱为止。
        // 1.一直问换不换钱
        Scanner myScanner = new Scanner(System.in);
        char answer = ' ';
        do {
            System.out.println("老韩使出五连鞭！！！！！");
            System.out.println("还不还钱？y/n");
            answer = myScanner.next().charAt(0);
            System.out.println("他的回答是：" + answer);
        } while (answer !='y');

    }
}
