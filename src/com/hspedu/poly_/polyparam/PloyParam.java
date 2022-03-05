package com.hspedu.poly_.polyparam;

public class PloyParam {
    public static void main(String[] args) {
        Employee employee = new Employee("大猫",8000);
        Manager manager = new Manager("管理大师",10000,1000);
        ComStaff comStaff = new ComStaff("普通员工",6000);

        Test test = new Test();

        //System.out.println(employee.getName()+"的年工资："+test.showEmpAnnual(employee));
        //System.out.println(manager.getName()+"的年工资："+test.showEmpAnnual(manager));

        test.testWork(manager);
        test.testWork(comStaff);
    }
}

