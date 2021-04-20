package com.Factory;


/*
    Usb厂商
 */

public class UsbKingFactort implements UsbSell{
    @Override
    public float usbsell(int number) {
        Float price=85.0f;
        System.out.println("这里是厂商价格为："+price);
        return price;
    }
}
