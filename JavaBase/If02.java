/*
 * @Author: Marrido
 * @Date: 2022-02-13 12:05:26
 * @LastEditTime: 2022-02-13 12:19:21
 * @LastEditors: Marrido
 * @Description: if else
 * @FilePath: \Java\If02.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        // 定义一个Scanner对象
        Scanner inputAge = new Scanner(System.in);

        System.out.println("请输入您的年龄：");
        int age = inputAge.nextInt();

        if (age > 18) {
            System.out.println("您的年龄大于18岁，要对自己的行为负责，送入监狱！");
        } else {
            System.out.println("你的年龄不大，这次就放过你了");
        }
    }
}
