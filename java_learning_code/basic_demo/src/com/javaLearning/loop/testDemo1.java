package com.javaLearning.loop;

import java.util.Random;
import java.util.Scanner;
/*
    生成一个1~100之间的随机数
    利用键盘录入模拟猜的动作，一直猜，直到猜中为止

    抽卡的时候，有保底机制
    小保底：只要三次没有猜中，提示用户猜测的范围 ±5
    大保底：只要10次没有猜中，猜中了
*/
public class testDemo1 {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(1,100);
        int count = 0;

        while (true) {
            if(count == 3){
                System.out.println("正确的数字在"+(number-5)+"~"+(number+5)+"之间");
                count++;
            }
            else if(count == 11){
                System.out.println("恭喜你，猜中了！");
                break;
            } else{
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入一个数字");
                int guessNumber = sc.nextInt();
                count++;

                if(guessNumber < number){
                    System.out.println("你猜的数字小了");
                }else if(guessNumber > number){
                    System.out.println("你猜的数字大了");
                }else{
                    System.out.println("恭喜你猜中了");
                    break;
                }
            }
        }
    }
}
