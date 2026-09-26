package com.it;
//package：表示当前的类定义在哪个包中
//这段代码不需要写，因为默认包是com.it

//class：表示定义一个类，Java最基本的组成单元
//HelloWorld：类名
//类名和文件名必须一致，否则会报错
public class  HelloWorld {
//public：表示当前的类可以被其他类访问
    static void main(String[] args) {
        //main：主方法，程序的入口
        System.out.println("Hello World!");
        System.out.println("abc");      //自动换行输出
    }
}
