package com.lucas.abstrac_factory;

/**
 * File: null.java
 * Author: lucas.zhang
 * Date: 2024/9/9
 * Description:
 */
public class XiaomiFactory implements IProductFactory{
    @Override
    public IPhoneProduct getPhone() {
        return new XiaomiIphone();
    }

    @Override
    public IRouterProduct getRouter() {
        return new XiaomiRouter();
    }
}
