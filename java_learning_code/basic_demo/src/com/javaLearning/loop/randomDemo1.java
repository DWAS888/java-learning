package com.javaLearning.loop;
//定位Random类的位置
import java.util.Random;
public class randomDemo1 {
    public static void main(String[] args) {
            //生成一个1~9之间的随机数，利用键盘录入模拟猜的动作，一直猜，直到猜中为止
            // 1. 找到Random这个类
        Random r = new Random();
            // 2. 生成一个随机数
            // (了解)第一种写法：int n = r.nextInt();默认是在int的取值范围之内获取随机数
            // (重要)第二种写法：小括号写一个数字n，表示随机的最大值，但是不包含这个数字
            // (重要)第三种写法：小括号写两个数字a b，表示随机的取值范围是a~b，包含a，不包含b         JDK17
        for (int i = 0; i < 10; i++) {
            int n = r.nextInt(1,10);
            System.out.println(n);
        }
    }
}