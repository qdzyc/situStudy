package com.situ.foundation2;

import lombok.Data;

@Data
public class Number {
    private int num1;
    private int num2;

    public Number(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String add() {
        int temp = num1 + num2;
        return "num1 + num2 = " + temp;
    }

    public String sub() {
        int temp = num1 - num2;
        return "num1 - num2 = " + temp;
    }

    public String multi() {
        int temp = num1 * num2;
        return "num1 * num2 = " + temp;
    }
    public String div() {
        double temp = (double)num1 / (double)num2;
        return "num1 / num2 = " + temp;
    }
}
