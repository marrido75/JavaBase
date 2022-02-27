package com.hspedu.encap;


public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        //person.setName("jack wang la");
        //person.setAge(30);
        //person.setSalary(200000);

        //System.out.println(person.info());
        //System.out.println(person.getSalary());

        System.out.println("smith的信息");
        Person person1 = new Person("smith", 200, 30000);
        System.out.println(person1.info());

    }
}


/**
 * 不能查看年龄 工资  并对设置的年龄进行合理的验证。
 * 年龄合理就设置  否则默认
 * 年龄 1-120 年龄 工资不能查看 name的长度在2-6字符之间
 */
class Person {
    public String name;
    private int age;
    private double salary;

    //无参构造器
    public Person() {
    }

    //有三个属性的构造器
    public Person(String name, int age, double salary) {
        //this.name = name;
        //this.age = age;
        //this.salary = salary;
        //将set方法写入构造器
        this.setName(name);
        setAge(age);
        setSalary(salary);
    }

    //set + get 封装
    //快捷键  ALT +INSERT

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=2 && name.length()<=6){
            this.name = name;
        }else {
            System.out.println("名字长度不对（2-6） 默认");
            this.name = "文明人";
        }
    }

    public int getAge() {
        return age;
    }

    //年龄必须在1-120
    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄必须在1-120");
            //默认年龄
            this.age = 18;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        //可以增加当前对象的权限判断
        //if else return;
        this.salary = salary;
    }

    //返回属性信息
    public String info() {
        return "信息为 name=" + name + " age=" + age + " salry=" + salary;
    }


}
