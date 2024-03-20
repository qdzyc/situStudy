package com.situ.foundation2.cal;

public class Div extends Cal {
    public Div() {
    }

    public Div(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public int getResult() {
        return this.getNum1() / this.getNum2();
    }
}
