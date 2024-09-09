package com.lucas.abstrac_factory;

/**
 * File: null.java
 * Author: lucas.zhang
 * Date: 2024/9/8
 * Description: 手机产品接口
 */
public interface IPhoneProduct {
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
 * 执行拨号操作
 *
 */
void callUp();

/**
 * 发送短信
 *
 */
void sendSMS();

}
