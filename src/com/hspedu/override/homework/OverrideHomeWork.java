package com.hspedu.override.homework;

public class OverrideHomeWork {
    public static void main(String[] args) {
        Person person = new Person("猫王", 19);
        System.out.println(person.say());
        System.out.println("====================");
        Student student = new Student("电动蝶", 18, 9517, 100);
        System.out.println(student.say());
    }
}

