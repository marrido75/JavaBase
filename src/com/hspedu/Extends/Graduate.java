package com.hspedu.Extends;

public class Graduate {
    public String name;
    public int age;
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void testing() {
        System.out.println("大学生" + name + "正在考大学数学。。");
    }

    public void showInfo() {
        System.out.println("学生名 " + name + " 年龄 " + age + " 成绩 " + score);
    }


}
