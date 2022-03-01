package com.hspedu.override.homework;

public class Test {
    public static void main(String[] args) {
        S s = new S("大大大",18,154,100);
        System.out.println(s.say());
        s.setId(156);
        s.setScore(4564321);
        s.setName("维克多弗兰");
        s.setAge(58);

        System.out.println(s.say());

    }
}


