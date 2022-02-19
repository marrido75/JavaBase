package JavaBase;


/*
 * @Author: Marrido
 * @Date: 2022-02-14 21:37:40
 * @LastEditTime: 2022-02-19 11:09:37
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase\Break04.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
import java.util.Scanner;

public class Break04 {
    public static void main(String[] args) {
        // 登陆验证 3次机会 不成功提示还剩几次机会，
        Scanner myScanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入账号：");
            String username = myScanner.next();
            System.out.println("请输入密码：");
            String password = myScanner.next();
            if ("bug机".equals(username) && "123".equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("密码错误，您还有" + (3-i) + "次机会");
                if (i == 3) {
                    System.out.println("已强制退出！");
                    break;
                }
            }
        }



    }
}