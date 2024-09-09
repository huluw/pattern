package com.lucas.abstrac_factory;

/**
 * File: null.java
 * Author: lucas.zhang
 * Date: 2024/9/9
 * Description: 抽象产品工厂 定义了一个产品族的产品生产行为
 */
public interface IProductFactory {

    /// 生产手机
    IPhoneProduct getPhone();

    /// 生产路由器
    IRouterProduct getRouter();
}
