package com.lucas.build;

/**
 * File: null.java
 * Author: lucas.zhang
 * Date: 2024/9/11
 * Description:
 */
public class Director {
    Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct(String board,String display) {
        builder.buildBoard(board);
        builder.buildDisplay(display);
        builder.buildOs();
    }
}
