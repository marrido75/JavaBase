/*
 * @Author: Marrido
 * @Date: 2022-02-22 21:20:03
 * @LastEditTime: 2022-02-22 22:38:31
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase07\MiGong.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class MiGong {
    public static void main(String[] args) {

        /**
         * 创建一个迷宫 用二维数组表示
         * 规定数组元素 0为可走 1为不能走
         */

        int[][] map = new int[8][7];

        // 将上面一行和最后一行设置为1
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }

        // 第一列 和最后一列设置成1

        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }

        map[3][1] = 1;
        map[3][2] = 1;

        // for (int i = 0; i < map.length; i++) {
        //     for (int j = 0; j < map[i].length; j++) {
        //         System.out.print(map[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        MiGongMethod m = new MiGongMethod();
        m.findWay(map, 1, 1);


        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class MiGongMethod {

    // 0.可以走 1.不能走 2.为找到通路（即map[6][5] = 2） 3.为已经走过的路
    // 下 右 上 左

    public boolean findWay(int map[][], int i, int j) {
        if (map[6][5] == 2) {// 找到通路
            return true;
        } else {
            if (map[i][j] == 0) {// 检测当前位置是否能走，能走 开始寻找下一步
                map[i][j] = 2;
                if (findWay(map, i + 1, j)) {// 往下走
                    return true;
                } else if (findWay(map, i, j + 1)) {// 往右走
                    return true;
                } else if (findWay(map, i - 1, j)) {// 上
                    return true;
                } else if (findWay(map, i, j - 1)) {// 往左走
                    return true;
                } else {// 已经走过
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    /**
     * map=
     * 1 1 1 1 1 1 1
     * 1 3 0 0 0 0 1
     * 1 3 0 0 0 0 1
     * 1 1 1 0 0 0 1
     * 1 0 0 0 0 0 1
     * 1 0 0 0 0 0 1
     * 1 0 0 0 0 0 1
     * 1 1 1 1 1 1 1
     */
}