package com.lucas.build;

/**
 * File: null.java
 * Author: lucas.zhang
 * Date: 2024/9/11
 * Description:
 */
public class MacBookBuild extends Builder{
    private Computer mComputer = new MacBook();
    @Override
    void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    void buildDisplay(String display) {
    mComputer.setDisplay(display);
    }

    @Override
    Computer build() {
        return mComputer;
    }

    @Override
    void buildOs() {
        mComputer.setOs();
    }
}
