package com.situ.foundation;

import org.junit.Test;

import java.util.Scanner;

public class OPPHomework {


    @Test
    public void numberTest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入num1 num2:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        Number number = new Number(num1, num2);
        System.out.println(number.add());
        System.out.println(number.sub());
        System.out.println(number.multi());
        System.out.println(number.div());
    }

    @Test
    public void rectangleTest() {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        System.out.println(rectangle.Perimeter());
        System.out.println(rectangle.Area());
        System.out.println("---------");
        int side = scanner.nextInt();
        Rectangle rectangle1 = new Rectangle(side);
        System.out.println(rectangle1.Perimeter());
        System.out.println(rectangle1.Area());
        System.out.println("---------");
        int width = scanner.nextInt();
        int length = scanner.nextInt();
        Rectangle rectangle2 = new Rectangle(length,width);
        System.out.println(rectangle2.Perimeter());
        System.out.println(rectangle2.Area());

    }

}
