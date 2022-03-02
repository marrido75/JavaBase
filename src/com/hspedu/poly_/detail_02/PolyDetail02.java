package com.hspedu.poly_.detail_02;

public class PolyDetail02 {
    public static void main(String[] args) {

        //属性没有重写一说。属性值看编译类型
        Base base = new Sub();
        System.out.println(base.count);//10

        Sub sub = new Sub();
        System.out.println(sub.count);//20
    }
}

class Base {
    int count = 10;//属性
}

class Sub extends Base {
    int count = 20;//属性
}
