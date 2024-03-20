package com.situ.foundation1;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        //final 修饰的变量为常量，不可再次改变
//        final int age = 2;

        System.out.println(1);
    }


    @Test
    public void test() {
        //大到小转换会丢失精度
        // 强制转换类型
        char ch = 'a';
        System.out.println(ch);
        System.out.println(ch + 1);
        System.out.println((char) (ch + 1));
        //soutm打印方法名
        System.out.println("HelloWorld.test");

//        System.out.println(3&7);

    }

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
        int num1 = 10;
        int num2 = 20;
        int max = num1 >= num2 ? num1 : num2;
        System.out.println(max);

        System.out.println(10 + 20 + "" + 30);//3030
        System.out.println(10 + "" + 20 + 30);//102030
    }

    @Test
    public void test11() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("闰年");
        } else {
            System.out.println("平年");
        }
    }

    @Test
    public void test12() {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num1 = scanner1.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = scanner2.nextInt();
        //交换
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1);
        System.out.println(num2);
    }

    @Test
    public void test13() {
        //精度损失
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("请输入物品单价：");
//        double price = scanner1.nextDouble();
//
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("请输入物品数量：");
//        double num = scanner2.nextDouble();
//
//        Scanner scanner3 = new Scanner(System.in);
//        System.out.println("请输入所付金额：");
//        double money = scanner3.nextDouble();
//
//        double remainder = 0;
//
//        if (price * num < 500) {
//            remainder = money - price * num;
//            if(remainder >= 0){
//                System.out.println("找零：" + remainder);
//            }else {
//                System.out.println("所付金额不足，请补充" + remainder + "元");
//            }
//        }else {
//            remainder = money - (price * num) * 0.8;
//            if(remainder >= 0){
//                System.out.println("找零：" + remainder);
//            }else {
//                System.out.println("所付金额不足，请补充" + remainder + "元");
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入物品单价：");
        BigDecimal price = scanner.nextBigDecimal();
        if (price.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("非法输入！");
            return;
        }

        System.out.println("请输入物品数量：");
        BigDecimal num = scanner.nextBigDecimal();
        if (num.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("非法输入！");
            return;
        }

        System.out.println("请输入所付金额：");
        BigDecimal money = scanner.nextBigDecimal();
        if (money.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("非法输入！");
            return;
        }
        //常量
        BigDecimal temp = new BigDecimal("500");
        BigDecimal discount = new BigDecimal("0.8");
        //总价
        BigDecimal total = price.multiply(num);
        //计算总价是否大于500
        int i = total.compareTo(temp);
        //如果总价大于500,打八折
        if (i >= 0) {
            total = total.multiply(discount);
        }
        //总价不大于500不打折
        BigDecimal remainder = money.subtract(total);
        if (remainder.compareTo(BigDecimal.ZERO) >= 0) {
            System.out.println("找零：" + remainder + "元");
        } else {
            System.out.println("所付金额不足，请补充" + remainder.negate() + "元");
        }
    }


    @Test
    public void test14() {
        int i;
        for (i = 1; i <= 5; i++) {
            int j = 1;
            while (j <= i) {
                if (j == i) {
                    System.out.println(j);
                } else {
                    System.out.print(j);
                }
                j++;
            }
        }
    }

    @Test
    public void test15() {
        //正三角
        for (int i = 1; i <= 11; i += 2) {
            for (int j = (11 - i) / 2; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //倒三角
        for (int i = 11; i >= 0; i -= 2) {
            for (int j = (11 - i) / 2; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Test
    public void test16() {
        int odd = 0;
        int even = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }
        System.out.println("奇数和:" + odd + " 偶数和:" + even);
    }

    @Test
    public void test17() {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 5 == 0) {
                count++;
                if (count < 3) {
                    System.out.print(i + " ");
                } else {//第三个数换行
                    System.out.println(i);
                    count = 0;//清空count
                }
            }
        }
    }

    @Test
    public void test18() {
        int count = 1;
        for (int i = 9; i > 0; i--) {
            if (i == 1) {
                System.out.print(i + "=");
            } else {
                System.out.print(i + "*");
            }
            count *= i;
        }
        System.out.println(count);
    }

}
