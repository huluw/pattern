package com.lucas.abstrac_factory;

/**
 * File: null.java
 * Author: lucas.zhang
 * Date: 2024/9/9
 * Description:
 */
public class HuaweiPhone implements IPhoneProduct{
    @Override
    public void start() {
        System.out.println("HuaweiPhone start");
    }

    @Override
    public void shutdown() {
    System.out.println("HuaweiPhone shutdown");
    }

    @Override
    public void callUp() {
    System.out.println("HuaweiPhone callUp");
    }

    @Override
    public void sendSMS() {
    System.out.println("HuaweiPhone sendSMS");
    }
}
