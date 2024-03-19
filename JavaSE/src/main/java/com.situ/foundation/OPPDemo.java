package com.situ.foundation;

import org.junit.Test;

import java.util.Scanner;

public class OPPDemo{
    @Test
    public void test() {
        Scanner scanner = new Scanner(System.in);

        String id = scanner.nextLine();
        String name = scanner.nextLine();
        String sex = scanner.nextLine();
        Student student = new Student(Integer.parseInt(id),name,sex);

//        //students.for
//        for (Student student : students) {
//            System.out.println(student);
//        }
        System.out.println(student);
    }
}
