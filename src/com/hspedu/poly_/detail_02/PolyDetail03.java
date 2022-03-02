package com.hspedu.poly_.detail_02;

public class PolyDetail03 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b instanceof B);//T
        System.out.println(b instanceof A);//T

        A a = new A();

        System.out.println(a instanceof A);//T
        System.out.println(a instanceof B);//F

    }
}

class A{


}
class B extends A{

}