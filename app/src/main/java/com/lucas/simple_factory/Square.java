package com.lucas.simple_factory;

import android.util.Log;

/**
 * File: null.java
 * Author: lucas.zhang
 * Date: 2024/9/8
 * Description:
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("draw Square");
    }
}
