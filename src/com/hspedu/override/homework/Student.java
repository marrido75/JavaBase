package com.hspedu.override.homework;

public class Student extends Person {
    private int id;
    private int score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public Student(String name, int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say() {
        //return "自我介绍：\n" + "姓名：" + getName() + "\n年龄：" + getAge() + "\nID：" + getId() + "\n分数：" + getScore();
        return super.say() + "\nID：" + id + "\n分数：" + score;
    }
}
