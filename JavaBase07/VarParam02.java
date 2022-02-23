/*
 * @Author: Marrido
 * @Date: 2022-02-23 21:37:43
 * @LastEditTime: 2022-02-23 21:50:10
 * @LastEditors: Marrido
 * @Description: 可变参数测试题
 * @FilePath: \JavaBase\JavaBase07\VarParam02.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class VarParam02 {
    public static void main(String[] args) {
        RecRes res = new RecRes();

        System.out.println(res.calcRes("小明", 99, 86.5, 100));
    }
}

class RecRes {
    public String calcRes(String name, double... Scores) {
        double scoreSum = 0.0;
        for (int i = 0; i < Scores.length; i++) {
            scoreSum += Scores[i];
        }

        return name + "的" + Scores.length + "门课成绩总分为：" + scoreSum;
    }
}

/*有三个方法，分别实现返回姓名和两门课成绩(总分)， 
返回姓名和三门课成绩(总分)，
返回姓名和五门课成绩（总分）。 
封装成一个可变参数的方法 */