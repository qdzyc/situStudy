package com.situ.foundation3.interfaceDemo;

public class Demo {
    public static void main(String[] args) {
        //父类声明 new子类，子类调用只可使用本父类里存在的方法
        AbstractBird abstractBird = new DaYan();
        abstractBird.egg();
        //接口当父类使用，同上
        IFly iFly = new DaYan();
        iFly.fly();
        //子类自己声明new自己，即可调用所有方法
        DaYan daYan = new DaYan();
        daYan.print();
        daYan.egg();
        daYan.fly();

    }
}
