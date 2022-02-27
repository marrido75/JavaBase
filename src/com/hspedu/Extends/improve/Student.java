package com.hspedu.Extends.improve;

//父类, 是pupil 和 graduate 的父类
public class Student {
    public String name;
    public int age;
    private double score;

    public double getScore() {
        return score;
    }

    //两个共有的方法
    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("学生名 " + name + " 年龄 " + age + " 成绩 " + score);
    }
}
