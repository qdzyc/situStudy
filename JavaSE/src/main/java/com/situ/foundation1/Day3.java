package com.situ.foundation1;

import org.junit.Test;

import java.util.Random;
import java.util.Scanner;

public class Day3 {
    @Test
    public void test1() {
        Scanner sc = new Scanner(System.in);
        //表达异常时使用卫语句，减少if-else的多层套用(多个else时使用)
        System.out.println("请输入成绩");
        int score = sc.nextInt();
        if (score > 100 || score < 0) {
            System.out.println("非法输入！");
            return;
        }
        if (score >= 90 && score < 100) {
            System.out.println("优秀");
            return;
        }
        if (score >= 80 && score < 90) {
            System.out.println("良好");
            return;
        }
        if (score >= 70 && score < 80) {
            System.out.println("一般");
            return;
        }
        if (score >= 60 && score < 70) {
            System.out.println("及格");
            return;
        }
        System.out.println("不及格");
    }

    @Test
    public void test2() {
        Random random = new Random();
        random.nextInt(1000);
    }

    @Test
    public void test3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        if (month < 0 || month > 12) {
            System.out.println("非法输入！");
            return;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30天");
                break;
            case 2:
                System.out.println("28天/29天");
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入年份：");
                int year = sc.nextInt();
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                    System.out.println("闰年，29天");
                } else {
                    System.out.println("平年，28天");
                }
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
