/*
 * @Author: your name
 * @Date: 2022-02-19 22:26:30
 * @LastEditTime: 2022-02-19 23:07:42
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \JavaBase\JavaBase07\Method01.java
 */
package JavaBase07;

public class Method01 {
    public static void main(String[] args) {
        // 方法使用
        // 1.如果不去调用不会输出
        // 2.先创建对象，再调用方法
        Persons p = new Persons();
        p.speak();
        p.cal01();// 调用cal01方法
        p.cal02(1111);// 调用cal02方法
        int sum = p.getSum(1, 2);
        System.out.println("和为" + sum);
    }
}

class Persons {
    String name;
    int age;

    // 方法（成员方法）
    // 1.public表示公开的
    // 2.void表示没有返回值
    // speak() 是方法名 （）形参列表
    // {}方法体
    public void speak() {
        System.out.println("我是一个好人");
    }

    // 添加cal01 成员方法 可以计算从1+2+...+1000的结果）
    public void cal01() {
        // 循环
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println("结果为:" + sum);
    }

    // 添加cal02 接收一个数n 计算1+2+...+n的结果
    public void cal02(int n) {
        // 循环
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("结果为:" + sum);
    }

    // 添加getSum成员方法，计算两个值的和
    public int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    
}