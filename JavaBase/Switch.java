package JavaBase;


/*
 * @Author: Marrido
 * @Date: 2022-02-13 14:23:54
 * @LastEditTime: 2022-02-19 11:12:38
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase\Switch.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        // 345春季 678夏季 9 10 11 秋季 12 1 2 冬季
        Scanner inputMonth = new Scanner(System.in);
        System.out.println("输入月份：");
        int month = inputMonth.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("春季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("春季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
