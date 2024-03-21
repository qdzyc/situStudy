package com.situ.foundation2.cal;

import lombok.Data;

/*
方法里存在抽象方法
这个类就是抽象类
子类必须实现抽象方法
如果子类不想实现，必须把自己变成抽象类
抽象类不可以被new实例化，只能被其他类继承
*/
@Data
public abstract class Cal {
    private int num1;
    private int num2;

    public Cal() {
    }

    public Cal(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //抽象方法，无方法体，方法的声明(因方法体内无内容，仅仅需要一个名称)
    public abstract int getResult();

}
