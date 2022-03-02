package com.hspedu.poly_.polyarr;

public class PloyArr {
    public static void main(String[] args) {
        Person[] persons = new Person[3];

        persons[0] = new Person("jack",20);
        persons[1] = new Student("EFX",20,100);
        persons[2] = new Teacher("FSDF",20,998.1);

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());
        }
    }
}
