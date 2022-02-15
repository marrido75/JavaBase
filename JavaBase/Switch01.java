
/*
 * @Author: Marrido
 * @Date: 2022-02-13 13:38:15
 * @LastEditTime: 2022-02-13 14:22:53
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \Java\Switch01.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        // 输入字符a.bc... 对应输出星期一二。。。
        Scanner inputByte = new Scanner(System.in);
        System.out.println("请输入字符：");
        char txt = inputByte.next().charAt(0);
        switch (txt) {
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
                break;
            case 'c':
                System.out.println("星期三");
                break;
            case 'd':
                System.out.println("星期四");
                break;
            case 'e':
                System.out.println("星期五");
                break;
            case 'f':
                System.out.println("星期六");
                break;
            case 'g':
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入的信息有误，请重新输入！");

        }

        // 跳出switch继续执行
        System.out.println("我会显示出来！");
    }
}
