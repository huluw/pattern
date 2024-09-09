package com.lucas.abstrac_factory;

/**
 * File: null.java
 * Author: lucas.zhang
 * Date: 2024/9/9
 * Description:
 */
public class HuaweiFactory implements IProductFactory{
    @Override
    public IPhoneProduct getPhone() {
        return new HuaweiPhone();
    }

    @Override
    public IRouterProduct getRouter() {
        return new HuaweiRouter();
    }
}
