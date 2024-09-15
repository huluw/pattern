package com.lucas.build;

/**
 * File: null.java
 * Author: lucas.zhang
 * Date: 2024/9/11
 * Description:
 */
public abstract class Builder {
    /**
     * 构建计算机的主板
     *
     * @param board 主板的类型或配置信息
     */
    abstract void buildBoard(String board);

    /**
     * 构建计算机的显示器
     *
     * @param display 显示器的类型或配置信息
     */
    abstract void buildDisplay(String display);

    /**
     * 创建一台计算机
     *
     * 此方法负责根据之前设置的配置信息来创建计算机实例
     *
     * @return Computer 创建的计算机实例
     */
    abstract Computer build();

    /**
     * 构建计算机的操作系统
     *
     * 此方法用于设置或配置计算机的操作系统
     */
    abstract void buildOs();
}
