/*
 * @Author: Marrido
 * @Date: 2022-02-24 21:58:01
 * @LastEditTime: 2022-02-24 22:07:18
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase07\HomeWork03.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class HomeWork03 {
    public static void main(String[] args) {
        Book b = new Book("修仙打本",100);
        System.out.println(b.updataPrice(99));
    }
}

class Book{
    String name;
    double price;
    public Book(String name,double price){
        this.name = name;
        this.price = price;
    }

    public double updataPrice(double price){
        if (this.price >150) {
            price = 150;
        } else if(this.price>100){
            price =100;
        }

        return price;
    }
}