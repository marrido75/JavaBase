package com.hspedu.extend.test;

public class Run extends Base{
    int a;
    String b;

    public Run() {
        //super()必须放在构造器的第一行
        super(10,"123");

        System.out.println("Run无参构造器被调用");
    }

    //public Run(int a) {
    //    super();
    //}

    public Run(int a, String b) {
        super(10,"321");
        System.out.println("Run(int a, String b)无参构造器被调用");
        this.a=a;
        this.b=b;
    }
}
