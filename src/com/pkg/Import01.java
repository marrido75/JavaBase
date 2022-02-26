package com.pkg;

//导入包
import java.util.Scanner;//建议使用
import java.util.*;//不建议使用


public class Import01 {
    public static void main(String[] args) {
        int[] arr = {-2,20,2,13,3};
//        传统方法  冒泡排序
//        系统提供了相关的类  提供了排序功能
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
