package com.hspedu.extend.improve;


public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小汪";
        pupil.age = 8;
        pupil.testing();
        pupil.setScore(80);
        pupil.showInfo();


        System.out.println("--------------------------------");

        Graduate graduate = new Graduate();
        graduate.name = "沙师弟";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(99);
        graduate.showInfo();
    }
}
