package com.lucas.build;

import androidx.annotation.NonNull;

/**
 * File: null.java
 * Author: lucas.zhang
 * Date: 2024/9/11
 * Description:计算机抽象类
 */
public abstract class Computer {
    // 保护变量 mBoard，用于存储电路板的信息
    protected String mBoard;

    // 保护变量 mDisplay，用于显示相关信息
    protected String mDisplay;

    protected String mOs;

    public void setBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    public void setDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public abstract void setOs();

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOs='" + mOs + '\'' +
                '}';
    }
}
