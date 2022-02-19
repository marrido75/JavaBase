package JavaBase;

/*
 * @Author: Marrido
 * @Date: 2022-02-09 20:32:03
 * @LastEditTime: 2022-02-19 11:12:33
 * @LastEditors: Marrido
 * @Description: 其它类型转字符串
 * @FilePath: \JavaBase\JavaBase\StringToBasic.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class StringToBasic {
    public static void main(String[] args) {

        int n1 = 100;
        float f1 = 1.1F;
        double d1 = 4.55;
        boolean b1 = false;
        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println("_________________");

        String nn1 = "41";
        String tt = "TRUE";
        int n233 = Integer.parseInt(nn1);
        double dd1 = Double.parseDouble(nn1);
        long ll1 = Long.parseLong(nn1);
        byte bb1 = Byte.parseByte(nn1);
        boolean bl1 = Boolean.valueOf(tt);
        System.out.println(n233);
        System.out.println(dd1);
        System.out.println(ll1);
        System.out.println(bb1);
        System.out.println(bl1);

        char cc1 = '\n';
        char cc2 = '\t';
        char cc3 = '\r';
        char cc4 = '\\';
        char cc5 = '1';
        char cc6 = '2';
        char cc7 = '3';
        System.out.println(cc1);
        System.out.println(cc2);
        System.out.println(cc3);
        System.out.println(cc4);
        System.out.println(cc5);
        System.out.println(cc6);
        System.out.println(cc7);

        String book1 = "天龙八部";
        String book2 = "葵花宝典";
        System.out.println(book1 + book2);

        char ccc1 = '男';
        char ccc2 = '女';
        System.out.println(ccc1 + ccc2);

        double price1 = 123.22;
        double price2 = 99.23;
        System.out.println(price1 + price2);

        String name = "jack";
        int age = 22;
        double score = 99.8;
        char gender = '女';
        String hobby = "踢足球";

        System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n" + name + "\t" + age + "\t" + score + "\t" + gender + "\t" + hobby);
    }
}
