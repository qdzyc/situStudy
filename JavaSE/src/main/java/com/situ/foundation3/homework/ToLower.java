package com.situ.foundation3.homework;

import org.junit.Test;

import java.util.Scanner;

public class ToLower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        StringBuilder newStr = new StringBuilder();
        //将大写字母转为小写并拼接起来
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] <= 'Z' && chars[i] >= 'A') {
                chars[i] += 32;
            }
            newStr.append(chars[i]);
        }
        System.out.println(newStr);
    }

}
