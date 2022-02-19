package JavaBase;

/*
 * @Author: Marrido
 * @Date: 2022-02-10 19:52:01
 * @LastEditTime: 2022-02-19 11:12:47
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase\test001.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class test001 {
    public static void main(String[] agrs){
        int i  = 5645649;
        int s = i / 7;
        int st = i % 7;

        // 加入还有59天放假，问：合xx个星期零xx天？
        // int s = 59 / 7;
        // int st = 59 % 7;
        System.out.println("合"+ s +"个星期零"+ st +"天");


        double hs = 234.5;
        double ss = 5.0 / 9 * (hs -  100);
        System.out.println("华氏温度" + hs +"对应的摄氏温度为：" + ss);

        // 数学公式在Java中需要把int改为double类型后计算

    }
}
