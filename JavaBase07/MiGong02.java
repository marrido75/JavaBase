/*
 * @Author: Marrido
 * @Date: 2022-02-22 22:38:38
 * @LastEditTime: 2022-02-22 23:14:50
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase07\MiGong02.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class MiGong02 {
    public static void main(String[] args) {
        /**
         * 定义一个二维数组
         * 1 1 1 1 1 1 1 1 1 1
         * 1 0 0 0 0 0 0 0 0 1
         * 1 0 0 0 0 0 0 0 0 1
         * 1 1 0 1 0 0 0 0 0 1
         * 1 0 0 0 0 0 0 0 0 1
         * 1 0 0 0 0 0 1 0 0 1
         * 1 0 1 1 0 0 0 0 0 1
         * 1 0 0 0 1 0 0 0 0 1
         * 1 0 0 0 0 0 0 0 0 1
         * 1 1 1 1 1 1 1 1 1 1
         */

        int[][] map = new int[10][10];

        for (int i = 0; i < 10; i++) {
            map[i][0] = 1;
            map[i][9] = 1;
            map[0][i] = 1;
            map[9][i] = 1;
        }

        map[3][1] = 1;
        map[3][3] = 1;
        map[6][2] = 1;
        map[6][3] = 1;
        map[7][4] = 1;
        map[5][6] = 1;

        Mg m = new Mg();
        m.MiGong(map, 1, 1);//从1-1开始s

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }
        /**
         * 1 1 1 1 1 1 1 1 1 1
         * 1 2 0 0 0 0 0 0 0 1
         * 1 2 2 0 0 0 0 0 0 1
         * 1 1 2 1 0 0 0 0 0 1
         * 1 0 2 0 0 0 0 0 0 1
         * 1 0 2 2 2 0 1 0 0 1
         * 1 0 1 1 2 2 0 0 0 1
         * 1 0 0 0 1 2 0 0 2 1
         * 1 0 0 0 0 2 2 2 2 1
         * 1 1 1 1 1 1 1 1 1 1
         */

    }
}

// 0能走 1不能走 2为标记路线
class Mg {
    public boolean MiGong(int map[][], int x, int y) {
        // 判断是否已经到达位置
        if (map[x][y] == 2) { // 如果已经到达位置 直接跳出
            return true;
        } else {// 没有到达位置 则开始判断 下一步路径能不能走
            //
            if (map[x][y] == 0) {//
                map[x][y] = 2;// 如果能走，就把当前位置设置成 2
                // 用递归判断下一步能不能走
                if (MiGong(map, x + 1, y)) {// 判断向右能不能走
                    return true;
                } else if (MiGong(map, x, y + 1)) {// 右
                    return true;
                } else if (MiGong(map, x - 1, y)) {// 上
                    return true;
                } else if (MiGong(map, x, y - 1)) {// 左
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;// 都不能走 死局
            }

        }
    }
}
/**
 * 1 1 1 1 1 1 1 1 1 1
 * 1 0 0 0 0 0 0 0 0 1
 * 1 0 0 0 0 0 0 0 0 1
 * 1 1 0 1 0 0 0 0 0 1
 * 1 0 0 0 0 0 0 0 0 1
 * 1 0 0 0 0 0 1 0 0 1
 * 1 0 1 1 0 0 0 0 0 1
 * 1 0 0 0 1 0 0 0 0 1
 * 1 0 0 0 0 0 0 0 0 1
 * 1 1 1 1 1 1 1 1 1 1
 */