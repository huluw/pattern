package com.lucas.protoupe;

/**
 * File: null.java
 * Author: lucas.zhang
 * Date: 2024/9/11
 * Description:原型模式
 * 允许通过复制现有对象创建新对象，而不是通过创建实例的方式
 * 这种方式可以减少创建对象的开销 特别时创建复杂对象，初始化数据比较复杂 或者资源消耗比较大的
 */
public class Test {
    public static void main(String[] args)
    {
        ConcretePrototype concretePrototype = new ConcretePrototype("lucas");

        Prototype clone = (ConcretePrototype)concretePrototype.clone();
        System.out.println(clone.getName());
    }
}
