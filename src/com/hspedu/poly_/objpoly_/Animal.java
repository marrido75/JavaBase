package com.hspedu.poly_.objpoly_;

public class Animal {
    public void cry(){
        System.out.println("Animal cry() 动物在尖叫");
    }
}

class Tiger extends Animal{
    public void cry(){
        System.out.println("Tiger cry() 老虎在尖叫");
    }
}

class Lion extends Animal{
    public void cry(){
        System.out.println("Lion cry() 狮子在尖叫");
    }
}

