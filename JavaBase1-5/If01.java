/*
 * @Author: Marrido
 * @Date: 2022-02-13 11:51:18
 * @LastEditTime: 2022-02-13 11:58:04
 * @LastEditors: Marrido
 * @Description: if控制语句
 * @FilePath: \Java\If01.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {

        Scanner inputName = new Scanner(System.in);
        System.out.println("请告知您的年龄：");
        int age = inputName.nextInt();
        if(age > 18){
            System.out.println("您的年龄大于18岁，要对自己的行为负责，送入监狱！");
        }


    }
}