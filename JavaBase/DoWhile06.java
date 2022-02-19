package JavaBase;

import java.util.Scanner;

/*
 * @Author: Marrido
 * @Date: 2022-02-13 20:17:43
 * @LastEditTime: 2022-02-19 11:10:28
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase\DoWhile06.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class DoWhile06 {
    public static void main(String[] args) {

        Scanner inputYn = new Scanner(System.in);
        String yn = " ";
        do {
            System.out.println("邪魅一笑！！！");
            System.out.println("这bug能不能改？y/n");
            yn = inputYn.next();
            if (yn.equals("y")) {
                System.out.println("他说能改了！");
            } else {
                System.out.println("他还是不改！！！"+yn);
            }
        } while (yn.equals("n"));
    }
}
