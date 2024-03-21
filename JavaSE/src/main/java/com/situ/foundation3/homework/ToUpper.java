package com.situ.foundation3.homework;

import java.util.Scanner;

public class ToUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        StringBuilder newStr = new StringBuilder();
        //将小写字母转为大写并拼接起来
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] <= 'z' && chars[i] >= 'a') {
                chars[i] -= 32;
            }
            newStr.append(chars[i]);
        }

        System.out.println(newStr);

    }
}
