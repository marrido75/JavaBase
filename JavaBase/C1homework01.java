package JavaBase;

/*
 * @Author: Marrido
 * @Date: 2022-02-15 18:36:08
 * @LastEditTime: 2022-02-19 11:09:30
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase\C1homework01.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class C1homework01 {
    public static void main(String[] args) {
        double money = 100000;
        int n = 0;
        while (true) {
            if (money > 50000) {//大于50000时扣5%
                money *= 0.95;
                n+=1;
            }else if(money>=1000){//小于等于50000时扣1000
                money-=1000;
                n+=1;
            }else{
                break;
            }
        }
        System.out.println(n+" "+money);//次数和剩余钱数
        // while (money > 50000) {
        // money = money * (1 - 0.05);
        // System.out.println(money);
        // n += 1;
        // }
        // while (money <= 50000) {
        // money -= 1000;
        // System.out.println(money);
        // n += 1;
        // if (money < 1000) {
        // break;
        // }
        // }
        // System.out.println("可以过" + n + "次路口");
        // System.out.println("剩余" + money);

    }
}
