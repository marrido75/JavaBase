/*
 * @Author: Marrido
 * @Date: 2022-02-22 23:23:22
 * @LastEditTime: 2022-02-22 23:43:23
 * @LastEditors: Marrido
 * @Description: 汉罗塔
 * @FilePath: \JavaBase\JavaBase07\HanoiTower.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class HanoiTower {
    public static void main(String[] args) {
        Ht ht = new Ht();
        ht.move(2, 'a', 'b', 'c');
    }
}

class Ht {
    public void move(int num, char a, char b, char c) {
        // 如果只有一个盘  直接a-c
        if (num == 1) {
            System.out.println(a + "->" + c);
        } else {
            //  如果有2个盘，先把上面所有盘（num-1）移动到 b
            // 借助c
            move(num-1, a, c, b);
            // 把a最下面的盘移到c
            System.out.println(a + "->" + c);
            // 再把b的所有盘移动到c 借助a
            move(num-1, b, a, c);
        }
    }
}
