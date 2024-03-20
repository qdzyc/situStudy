package com.situ.foundation1;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * 异常的处理
 * IO
 * */
public class Exercise {
    @Test
    public void test() {
        System.out.println("请输入数据：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
    }

}
