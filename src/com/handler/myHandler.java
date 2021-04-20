package com.handler;

import com.Factory.UsbSell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class myHandler implements InvocationHandler {

    /*
     1：调用厂商方法
     2：代理进行功能增强(加价等等)
     */

    //要执行目标方法，首先获取传来目标的对象，就为该目标对象创建代理
    private Object object=null;

    public myHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            //执行目标对象的方法(反射)
            Object rest=null;
            rest=method.invoke(object,args);
            //功能增强
             Float price=null;
            if (rest!=null){
                price=(Float) rest;
                price+=25;

            }

        return price;
    }
}
