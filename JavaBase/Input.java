package JavaBase;

/*
 * @Author: Marrido
 * @Date: 2022-02-11 20:22:22
 * @LastEditTime: 2022-02-19 11:11:45
 * @LastEditors: Marrido
 * @Description: 扫描输入
 * @FilePath: \JavaBase\JavaBase\Input.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("请输入名字：");
        String name = myScanner.next();
        System.out.println("请输入年龄：");
        int age = myScanner.nextInt();
        System.out.println("请输入收入:");
        double sal =myScanner.nextDouble();

        System.out.println("人的信息如下：");
        System.out.println("名字："+name+"\t年龄："+ age+"\t薪水："+sal);



    }
}