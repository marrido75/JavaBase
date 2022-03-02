package com.hspedu.poly_.old;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feed(Animal animal,Food food){
        System.out.println("主人 " + name + "给" + animal.getName()
                            + " 吃" + animal.getName());
    }

    //准备给小狗喂食骨头
    //public void feed(Dog dog, Bone bone) {
    //    System.out.println("主人 " + name + "给" + dog.getName()
    //            + " 吃" + bone.getName());
    //}

    //构成了方法重载
    //主人给小猫喂小鲫鱼
    //public void feed(Cat cat, Fish fish) {
    //    System.out.println("主人 " + name + "给" + cat.getName()
    //            + " 吃" + fish.getName());
    //}

    //如果动物很多，食物很多
    //feed会很多 不利于管理和维护

}
