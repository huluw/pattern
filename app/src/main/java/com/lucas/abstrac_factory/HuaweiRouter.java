package com.lucas.abstrac_factory;

/**
 * File: null.java
 * Author: lucas.zhang
 * Date: 2024/9/9
 * Description:
 */
public class HuaweiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("HuaweiRouter start");
    }

    @Override
    public void shutdown() {
        System.out.println("HuaweiRouter shutdown");
    }

    @Override
    public void openWifi() {
        System.out.println("HuaweiRouter openWifi");
    }

    @Override
    public void setting() {
        System.out.println("HuaweiRouter setting");

    }
}
