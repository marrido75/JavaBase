package com.hspedu.poly_.polyarr;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String say() {
        return name + " " + age;
    }
}


class Student extends Person{
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    @Override
    public String say() {
        return super.say()+" "+ score;
    }
}


class Teacher extends Person{
    private double sal;

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Teacher(String name, int age, double sal) {
        super(name, age);
        this.sal = sal;
    }

    @Override
    public String say() {
        return super.say()+ " " + sal;
    }
}