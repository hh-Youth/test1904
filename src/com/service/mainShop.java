package com.service;

import com.Factory.*;
import com.handler.myHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class mainShop {
    public static void main(String[] args) {
        //创建厂商对象
        UsbKingFactort usbKing= new UsbKingFactort();
        //创建 InvocationHandler 对象
        InvocationHandler myhad = new myHandler(usbKing);
        //创建代理对象
        UsbSell proxy= (UsbSell) Proxy.newProxyInstance(usbKing.getClass().getClassLoader(),
                usbKing.getClass().getInterfaces(),myhad);
        System.out.println("代理商价格为："+proxy.usbsell(1));
        System.out.println("---");
    }
}
