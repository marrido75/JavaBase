/*
 * @Author: Marrido
 * @Date: 2022-02-13 10:07:31
 * @LastEditTime: 2022-02-13 10:27:17
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \Java\Bit.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
public class Bit {
    public static void main(String[] args) {

        // 先得到2的补码 00000000 00000000 00000000 00000010
        // 3的补码 00000000 00000000 00000000 00000011
        // 位运算时 00000000 00000000 00000000 00000010
        // 结果时2
        System.out.println(2 & 3);

        // -2的原码 10000000 00000000 00000000 00000010
        // -2的反码 11111111 11111111 11111111 11111101
        // -2的补码 11111111 11111111 11111111 11111110
        // ~-2 00000000 00000000 00000000 000000001
        // ~-2原码是 +1
        System.out.println(~-2);

        // 2的补码 00000000 00000000 00000000 00000010
        // ~2 11111111 11111111 11111111 11111101
        // 反码 11111111 11111111 11111111 11111100
        // 原码 10000000 00000000 00000000 00000011（-3）
        System.out.println(~2);

        // << >> >>>

        // 00000000 00000000 00000000 00000001
        // 00000000 00000000 00000000 00000000(00000000 01)
        int a =1>>2;
        System.out.println(a);
        // 00000001 => 00000100（4）
        int b =1<<2;
        System.out.println(b);

        System.out.println(15>>2);
    }
}