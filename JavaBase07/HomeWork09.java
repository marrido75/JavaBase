/*
 * @Author: Marrido
 * @Date: 2022-02-24 23:09:54
 * @LastEditTime: 2022-02-24 23:18:19
 * @LastEditors: Marrido
 * @Description: 
 * @FilePath: \JavaBase\JavaBase07\HomeWork09.java
 * Copyright (c) 2022 by Marrido, All Rights Reserved.
 */
package JavaBase07;

public class HomeWork09 {
    public static void main(String[] args) {
        Music m = new Music("喀秋莎", 100);
        m.play();
        System.out.println(m.info());
    }
}

class Music {
    String names;
    int times;

    public Music(String names, int times) {
        this.names = names;
        this.times = times;
    }

    public void play() {
        System.out.println(names + "正在播放 " + "时长" + times + "秒");
    }

    public String info() {
        return "音乐" + this.names + " 播放时长" + this.times;
    }
}