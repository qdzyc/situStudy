package com.situ.foundation2.cal;

public class CalDemo {
    public static void main(String[] args) {
        Add add = new Add(3, 5);
        int result = add.getResult();
        System.out.println(result);

        Sub sub = new Sub(3, 5);
        int result1 = sub.getResult();
        System.out.println(result1);

        Multi multi = new Multi(3, 5);
        int result2 = multi.getResult();
        System.out.println(result2);

        Div div = new Div(3, 5);
        int result3 = div.getResult();
        System.out.println(result3);
    }
}
