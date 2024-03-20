package com.situ.foundation2.cal;

import lombok.Data;

@Data
public class Cal {
    private int num1;
    private int num2;

    public Cal() {
    }

    public Cal(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getResult() {
        return 0;
    }


}
