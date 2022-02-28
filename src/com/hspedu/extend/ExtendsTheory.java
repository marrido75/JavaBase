package com.hspedu.extend;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();//内存分析
        //先加载 Object类
        //再加载GrandPa
        //再加载Father
        //最后加载Son

        //查找规则
        //1.看子类是否有这个属性，并且可以访问（不能访问则报错），则返回子类的信息
        //2.如没有，就看父类有没有，可访问则返回父类的信息。
        //3.以此类推直到Object.
        System.out.println(son.name);//大头儿子

        //私有属性需要创建一个公开的方法访问
        System.out.println(son.getAge());//38   父类Father中的
        System.out.println(son.hobby);//旅游   父类GrandPa中的
    }
}

class GrandPa {
    String name = "大头爷爷";//3个name 不冲突
    String hobby = "旅游";
}

class Father extends GrandPa {
    String name = "大头爸爸";
    private int age = 38;//3个name 不冲突

    public int getAge() {
        return age;
    }
}

class Son extends Father {
    String name = "大头儿子";//3个name 不冲突
}

