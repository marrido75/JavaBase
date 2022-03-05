package com.hspedu.poly_.polyparam;

public class Test {


    public double showEmpAnnual(Employee e) {
        return e.getAnnual();
    }

    //判断是管理者/普通员工
    public void testWork(Employee e){
        if (e instanceof ComStaff ){
            ((ComStaff) e).work();
        }else if(e instanceof Manager){
            ((Manager)e).manage();
        }else {
            System.out.println("不做处理");
        }
    }
}
