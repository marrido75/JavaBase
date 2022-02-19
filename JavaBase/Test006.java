package JavaBase;


/*
 * @Author: Marrido
 * @Date: 2022-02-13 21:39:43
 * @LastEditTime: 2022-02-19 11:13:21
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase\Test006.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
import java.util.Scanner;

public class Test006 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int sum = 0;
        for (int grade = 1; grade <= 3; grade++) {

            for (int stuNum = 1; stuNum <= 5; stuNum++) {
                System.out.println("请输入" + grade + "班第" + stuNum + "位学生成绩：");
                double stuScore = myScanner.nextDouble();
                if (stuScore > 60) {
                    sum++;
                }
            }
        }
        System.out.println("三个班的及格数一共是：" + sum);

    }
}
