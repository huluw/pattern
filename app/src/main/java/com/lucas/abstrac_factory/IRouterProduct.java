package com.lucas.abstrac_factory;

/**
 * File: null.java
 * Author: lucas.zhang
 * Date: 2024/9/9
 * Description: 路由接口产品
 */
public interface IRouterProduct {
    /**
     * 启动系统或服务
     *
     */
    void start();

    /**
     * 关闭系统或服务
     *
     */
    void shutdown();

    /**
     * 打开wifi
     */
    void openWifi();


    /**
     * 设置参数
     */
    void setting();
}
