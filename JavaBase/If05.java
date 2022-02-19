package JavaBase;

import java.util.Scanner;

/*
 * @Author: Marrido
 * @Date: 2022-02-13 13:10:14
 * @LastEditTime: 2022-02-19 11:11:48
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase\If05.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class If05 {
    public static void main(String[] args) {


        // 成绩大于8.0进入决赛，并分男女组 分别提示
        Scanner inputScore = new Scanner(System.in);
        System.out.println("请输入该歌手的成绩：");
        double Score = inputScore.nextDouble();
        if (Score > 8.0) {
            System.out.println("请输入性别：");
            char gender = inputScore.next().charAt(0);
            System.out.println("恭喜您进入" + gender + "子组决赛！");
        } else {
            System.out.println("sorry,您被淘汰了");
        }
    }
}