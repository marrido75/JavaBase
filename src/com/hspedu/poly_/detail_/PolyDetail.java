package com.hspedu.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {
        //向上转型:父类的引用指向子类的对象
        Animal animal = new Cat();
        animal.eat();//猫吃鱼
        animal.run();//run
        animal.show();//展示猪仔做啥
        animal.sleep();//sleep
        //animal.catchMouse(); 子类特有方法无法调用

        //向下转型
        Cat cat = (Cat) animal;//强值向下转型后 调用子类特有方法
        cat.catchMouse();

        //Dog dog = (Dog) animal;//不能把猫转成狗

    }
}
