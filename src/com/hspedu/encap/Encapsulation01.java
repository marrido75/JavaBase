package com.hspedu.encap;



public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();



        person.name = "jack";
        person.setAge(3000);
    }
}

class Person {
    public String name;
    private int age;
    private double salary;

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    //快捷键  ALT +INSERT





}
