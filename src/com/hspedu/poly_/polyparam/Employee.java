package com.hspedu.poly_.polyparam;

public class Employee {
    private String name;
    private double pay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public Employee(String name, double pay) {
        this.name = name;
        this.pay = pay;
    }


    public double getAnnual() {
        return pay * 12;
    }
}

//普通员工
class ComStaff extends Employee {
    public ComStaff(String name, double pay) {
        super(name, pay);
    }

    public void work() {
        System.out.println("普通员工");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}


//经理
class Manager extends Employee {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public Manager(String name, double pay, double bonus) {
        super(name, pay);
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println("管理者");
    }

    //重写获取年薪
    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}