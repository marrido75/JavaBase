
/*
 * @Author: your name
 * @Date: 2022-02-19 22:17:10
 * @LastEditTime: 2022-02-25 21:19:30
 * @LastEditors: Marrido
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \JavaBase\JavaBase07\Object04.java
 */
package JavaBase07;

public class Object04 {
    public static void main(String[] args) {
        Person1 a = new Person1();
        a.age = 10;
        a.name = "小明";
        Person1 b;
        b = a;
        System.out.println(b.name);//10
        b.age = 200;
        b = null;
        System.out.println(a.age);//200
        // System.out.println(b.age);//异常
    }
}

class Person1{
    int age;
    String name;
}