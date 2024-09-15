package com.lucas.protoupe;

/**
 * File: null.java
 * Author: lucas.zhang
 * Date: 2024/9/11
 * Description:
 */
public class ConcretePrototype implements Prototype,Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public ConcretePrototype(String name) {
        this.name = name;
    }

    //深拷贝克隆自身
    @Override
    public Object clone() {
        try {
            return (Prototype) super.clone();
        }catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
