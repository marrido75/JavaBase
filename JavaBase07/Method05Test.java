/*
 * @Author: Marrido
 * @Date: 2022-02-20 23:08:09
 * @LastEditTime: 2022-02-20 23:17:05
 * @LastEditors: Marrido
 * @Description: 打印10行5列的#
 * @FilePath: \JavaBase\JavaBase07\Method05Test.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class Method05Test {
    public static void main(String[] args) {
        Print pc = new Print();
        pc.printCode(10, 5, "#");
        // 打印10行5列的#
    }
}

class Print{
    public void printCode(int row, int col ,String c) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
