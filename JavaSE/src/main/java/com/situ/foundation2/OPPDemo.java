package com.situ.foundation2;

import org.junit.Test;

import java.util.Scanner;

public class OPPDemo{
    @Test
    public void test() {
        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt();
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        String sex = scanner.nextLine();
        Student student = new Student(id,name,age,sex);

//        //students.for
//        for (Student student : students) {
//            System.out.println(student);
//        }
        System.out.println(student);
    }
}
