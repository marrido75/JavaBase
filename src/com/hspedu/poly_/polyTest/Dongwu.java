package com.hspedu.poly_.polyTest;

public class Dongwu {
    public void cry(){
        System.out.println("动物在叫！");
    }
}

class Shizi extends Dongwu{
    public void cry(){
        System.out.println("狮子在尖叫");
    }
}

class Laohu extends Dongwu{
    public void cry(){
        System.out.println("老虎在尖叫");
    }
}