package com.situ.foundation3.homework;

import java.util.Scanner;

public class TrimDemo {

    public static void main(String[] args) {
        //System.out.println(str.trim());
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //找到第一个不为空格的字符
        char[] ch = str.toCharArray();
        int start = 0;
        int end = ch.length;
        for (char c : ch) {
            start++;
            if (c != ' ') {
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
            end--;
            if (ch[i] != ' ') {
                break;
            }
        }
        //将除去首尾空格的字符char类型的数组拼接位字符串
        StringBuilder strNew = new StringBuilder();
        for (int i = start - 1; i <= end; i++) {
            strNew.append(ch[i]);
        }

        System.out.println(strNew);
    }

}
