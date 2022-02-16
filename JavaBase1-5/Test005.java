import java.util.Scanner;

/*
 * @Author: Marrido
 * @Date: 2022-02-13 21:03:18
 * @LastEditTime: 2022-02-16 22:15:42
 * @LastEditors: Marrido
 * @Description: 所有班级的平均分
 * @FilePath: \JavaBase\JavaBase1-5\Test005.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class Test005 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        double sumGrade = 0;

        for (int grade = 1; grade <= 3; grade++) {
            int sumStu = 0;
            for (int stu = 1; stu <= 5; stu++) {
                System.out.println("请输入" + grade + "班第" + stu + "位学生的成绩");
                int stuScore = myScanner.nextInt();
                sumStu += stuScore;
            }
            sumGrade += sumStu;
            double avgStu = sumStu / 5.0;
            System.out.println(grade + "班的平均分是：" + avgStu);
        }
        double avgGrade = sumGrade / 3.0 / 5.0;
        System.out.println("所有班级的平均分是：" + avgGrade);

    }
}
