package com.situ.foundation3.interfaceDemo;

public class MiFeng extends AbstractInsect implements IFly{
    @Override
    public void chanluan() {
        System.out.println("MiFeng.chanluan");
    }

    @Override
    public void fly() {
        System.out.println("MiFeng.fly");
    }

    public void print() {
        System.out.println("MiFeng.print");
    }
}
