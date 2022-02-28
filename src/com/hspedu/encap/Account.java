package com.hspedu.encap;
//封装例子

public class Account {
    private String name;
    private double balance;
    private String password;

    //无参构造器
    public Account() {
    }

    //三参数构造器
    public Account(String name, double balance, String password) {
        setName(name);
        setBalance(balance);
        setPassword(password);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 1 && name.length() < 5) {
            this.name = name;
        } else {
            System.out.println("长度不对");
            this.name = "沙雕";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额必须大于20");
            this.balance = 8;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("密码不规范 6");
            this.password = "123456";
        }
    }

    public String Test() {
        return "name=" + name + " balance=" + balance + " password=" + password;
    }

}

class AccountTest {
    public static void main(String[] args) {
        //数据校验需要走构造器  或者  set方法
        Account account = new Account("1231313132131", 5, "46546546");


        //account.setName("jack11156+545646465465");
        //account.setBalance(19);
        //account.setPassword("789465");


        System.out.println(account.Test());
    }
}
