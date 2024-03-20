package com.situ.foundation2.cal;

public class Add extends Cal{
    public Add() {
    }

    public Add(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public int getResult() {
        return this.getNum1() + this.getNum2();
    }
}
