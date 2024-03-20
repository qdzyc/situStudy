package com.situ.foundation2;

import lombok.Data;

@Data
public class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(int side) {
        this.length = side;
        this.width = side;
    }
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public String Perimeter() {
        int temp = (length + width) * 2;
        return "长方形的周长为：" + temp;
    }

    public String Area() {
        int temp = length * width;
        return "长方形的面积为：" + temp;
    }


}
