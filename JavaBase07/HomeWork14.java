/*
 * @Author: Marrido
 * @Date: 2022-02-25 20:39:38
 * @LastEditTime: 2022-02-25 21:13:48
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase07\HomeWork14.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class HomeWork14 {
    public static void main(String[] args) {
        Tom t = new Tom(2);
        // System.out.println(t.cGame());
        t.cVsTom(1);
        t.cVsTom(2);
        t.cVsTom(3);
    }
}

class Tom {
    int n;// 0石头 1剪刀 2布

    public Tom(int n) {
        this.n = n;
    }

    public int cGame() {
        // 电脑随机出拳
        int cGame = (int) (Math.random() * 3);
        return cGame;
    }

    public void cVsTom(int n) {
        int c = cGame();
        if (n == c) {
            System.out.println("平手");
        } else {
            if (n == 0 && c == 1) {
                System.out.println("赢");
            } else if (n == 1 && c == 2) {
                System.out.println("赢");
            } else if (n == 2 && c == 0) {
                System.out.println("赢");
            } else if (n == c) {
                System.out.println("平手");
            }else{
                System.out.println("你输了");
            }
        }

    }

}