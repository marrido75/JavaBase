package com.hspedu.poly_.ployarr02;

//动物类
public class Animal {
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

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String like() {
        return name + "今年" + age + "岁";
    }
}


class Dog extends Animal {
    private String bone;

    public String getBone() {
        return bone;
    }

    public void setBone(String bone) {
        this.bone = bone;
    }

    public Dog(String name, int age, String bone) {
        super(name, age);
        this.bone = bone;
    }

    @Override
    public String like() {
        return super.like() + "，喜欢吃" + bone;
    }
}

class Cat extends Animal {
    private String eat;

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public Cat(String name, int age, String eat) {
        super(name, age);
        this.eat = eat;
    }

    @Override
    public String like() {
        return super.like() + "，喜欢吃" + eat;
    }
}
