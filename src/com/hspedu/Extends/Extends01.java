package com.hspedu.Extends;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 8;
        pupil.testing();
        pupil.setScore(80);
        pupil.showInfo();

        System.out.println("--------------------------------");

        Graduate graduate = new Graduate();
        graduate.name = "大师兄";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(99);
        graduate.showInfo();


    }
}


