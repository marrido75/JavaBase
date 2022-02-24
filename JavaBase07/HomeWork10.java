/*
 * @Author: Marrido
 * @Date: 2022-02-24 23:21:06
 * @LastEditTime: 2022-02-24 23:27:06
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase07\HomeWork10.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class HomeWork10 {
    public static void main(String[] args) {

    }
}

class Demo {
    int i = 100;
    public void m(){
        int j= i++;
        System.out.println(i);//101
        System.out.println(j);//100
    }
}

class Test02{
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = d1;
        d2.m();
        System.out.println(d1.i);//101
        System.out.println(d2.i);//101
    }
}