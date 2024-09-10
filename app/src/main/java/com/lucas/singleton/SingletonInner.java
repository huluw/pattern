package com.lucas.singleton;

/**
 * File: null.java
 * Author: lucas.zhang
 * Date: 2024/9/10
 * Description:静态内部类实现单类
 * 利用java静态内部类特性:
 * java 加载外部类的时候，不会创建内部类的实例，只有在外部类使用到内部类的时候 才会创建内部类实例
 */
public class SingletonInner {
    //私有构造函数 防止外部类创建
    private SingletonInner()   {}

    //静态内部类的优点：
    //instance 的唯一性 创建过程的线程安全性 都由jvm来保证
    //对象创建是安全的
    //支持延迟加载
    //获取对象时不需要加锁
    private static class SingletonHolder{
        private static final SingletonInner INSTANCE = new SingletonInner();
    }

    public static SingletonInner getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
