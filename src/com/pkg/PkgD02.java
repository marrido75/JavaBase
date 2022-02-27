//package作用表示声明当前类所在的包，需要在的最上面
//一个类最多只有一句package


package com.pkg;


//import 在package下面 ，类定义上面  可以多句，没有顺序顺序
import java.util.Arrays;
import java.util.Scanner;

//类定义
public class PkgD02 {
    public static void main(String[] args) {

        int[] arr = {1,2,88,3,55};
        Scanner scanner = new Scanner(System.in);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
