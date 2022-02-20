/*
 * @Author: Marrido
 * @Date: 2022-02-20 22:56:00
 * @LastEditTime: 2022-02-20 23:06:27
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase07\Method04Test.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class Method04Test {
    public static void main(String[] args) {
        AA aa = new AA();
        boolean isOddRes = aa.oddOrEven(457);
        System.out.println(isOddRes);
    }
}

class AA {
    public boolean oddOrEven(int a){
        boolean isOdd;
        if ((a%2)==0 && a!=0) {
            isOdd = true;
        } else {
            isOdd = false;
        }

        return isOdd;
    }
}
