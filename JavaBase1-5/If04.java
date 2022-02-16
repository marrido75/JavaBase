import java.util.Scanner;

/*
 * @Author: Marrido
 * @Date: 2022-02-13 12:39:14
 * @LastEditTime: 2022-02-13 12:53:07
 * @LastEditors: Marrido
 * @Description: 例子
 * @FilePath: \Java\If04.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class If04 {
    public static void main(String[] args) {

        Scanner inputNum = new Scanner(System.in);
        System.out.println("请输入您的信用分：");
        double num = inputNum.nextDouble();
        if(num >= 100.0){
            System.out.println("信用极好！");
        }else if(num > 80.0 && num <=99.0){
            System.out.println("信用优秀");
        }else if(num >60.0 && num<=80.0){
            System.out.println("信用一般");
        }else{
            System.out.println("信用不及格");
        }

    }
}
