package com.lucas.build;

/**
 * File: null.java
 * Author: lucas.zhang
 * Date: 2024/9/11
 * Description:
 *
 * 创建型设计模式
 * 将一个复杂对象的构建 与 它的表示分类 同样的构建过程可以创建不同的表示
 *
 * 使用场景
 * 过个部件 或者零件，都可以装配到一个对象中，但是产生的运行结果又不同
 * 初始化一个对象特别复杂，如使用多个构造函数 或者有很多参数 并且都有默认值时
 */
public class Test {
    @org.junit.Test
    public  void main(){
        // 创建一个MacBook构建器实例
        Builder builder = new MacBookBuild();
        // 创建一个总监实例，使用之前创建的MacBook构建器
        Director director = new Director(builder);
        // 指导构建过程，配置CPU类型和屏幕分辨率
        director.construct("arm","1080-p");
        // 通过构建器创建一台计算机
        Computer computer = builder.build();
        // 打印计算机的详细信息
        System.out.println(computer.toString());
    }
}
