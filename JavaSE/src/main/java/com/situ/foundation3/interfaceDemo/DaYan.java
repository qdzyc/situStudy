package com.situ.foundation3.interfaceDemo;

public class DaYan extends AbstractBird implements IFly {
    @Override
    public void fly() {
        System.out.println("DaYan.fly");
    }

    @Override
    public void egg() {
        System.out.println("DaYan.egg");
    }

    public void print() {
        System.out.println("DaYan.print");
    }
}
