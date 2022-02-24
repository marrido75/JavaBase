/*
 * @Author: Marrido
 * @Date: 2022-02-24 23:00:40
 * @LastEditTime: 2022-02-24 23:07:52
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase07\HomeWork08.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class HomeWork08 {
    int count = 9;

    public static void main(String[] args) {
        // 创建匿名对象后调用count1() 
        new HomeWork08().count1();// 10

        HomeWork08 h = new HomeWork08();
        h.count2();//9
        h.count2();//10
    }

    public void count1() {
        count = 10;//9->10
        System.out.println(count);//10
    }

    public void count2() {
        System.out.println(count++);//先取值后自增
    }
}
