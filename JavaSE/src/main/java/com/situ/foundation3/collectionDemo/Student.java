package com.situ.foundation3.collectionDemo;

import lombok.Data;

@Data
public class Student {
    //属性、成员变量
    //非静态的、需要new对象使用
    protected int id;
    protected String name;
    //静态变量
    public static String country = "中国";

    public void show() {
        System.out.println("Student.show");
    }

    //类加载的时候静态的就已经存在了，先后关系来说，静态的早于动态的而设置，所以无法调用动态的
    //静态的只能调用静态的，无论是方法还是属性
    public static void print() {
        System.out.println("Student.print");
        country = "中";
    }

    public Student() {
    }

    public Student(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
    }
}
