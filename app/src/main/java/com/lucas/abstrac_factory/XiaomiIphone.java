package com.lucas.abstrac_factory;

/**
 * File: null.java
 * Author: lucas.zhang
 * Date: 2024/9/9
 * Description:
 */
public class XiaomiIphone implements IPhoneProduct{
    @Override
    public void start() {
        System.out.println("XiaomiIphone start");
    }

    @Override
    public void shutdown() {
    System.out.println("XiaomiIphone shutdown");
    }

    @Override
    public void callUp() {
    System.out.println("XiaomiIphone callUp");
    }

    @Override
    public void sendSMS() {
    System.out.println("XiaomiIphone sendSMS");
    }
}
