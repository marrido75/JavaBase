/*
 * @Author: Marrido
 * @Date: 2022-02-19 11:05:23
 * @LastEditTime: 2022-02-19 11:10:36
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase\FloatDetail.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase;

public class FloatDetail{
	public static void main(String[] args) {
		
		float num1 = 1.1F;
		double num2 = 1.2;

		double num3 = 1.1F;

		double num4 = .235;

		double num5 =3.14e3;

		double num6 = 5.325454354353453;

		float num7 = 5.3254543553F;
		System.out.println(num7);


		double num11 = 2.7;
		double num12 = 8.1 / 3;

		// if (num11 ==num12) {
		//  	System.out.println("相等");
		//  } 

		 // 正确写法
		 if (Math.abs(num11 - num12) < 0.000001) {
		 	System.out.println(Math.abs(num11 - num12));
		 }


	}
}