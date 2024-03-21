package com.situ.foundation3.homework;

import java.util.Scanner;

public class TrimDemo {

    public static void main(String[] args) {
//        System.out.println(str.trim());
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //找到第一个不为空格的字符
        char[] ch = str.toCharArray();
        int start = 0;
        int end = ch.length;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ') {
                start = i;
                break;
            }
        }
        //如果字符全为空格则直接跳出
        if (start == ch.length) {
            System.out.println("全为空格");
            return;
        }
        //去掉尾部的多余空格
        for (int i = ch.length - 1; i > 0; i--) {
            if (ch[i] != ' ') {
                end = i;
                break;
            }
        }
        //将除去首尾空格的字符char类型的数组拼接位字符串
        StringBuilder strNew = new StringBuilder();
        for (int i = start; i <= end; i++) {
            strNew.append(ch[i]);
        }

        System.out.println(strNew);
    }

}
