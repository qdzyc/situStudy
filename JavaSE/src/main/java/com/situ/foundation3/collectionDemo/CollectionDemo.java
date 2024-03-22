package com.situ.foundation3.collectionDemo;

import org.junit.Test;

import java.util.ArrayList;

public class CollectionDemo {

    @Test
    public void test() {
        //数组的问题：下标确定，不够灵活
        Student[] students = new Student[3];

        ArrayList<Student> list = new ArrayList();
        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();
        list.add(student);
        list.add(student1);
        list.add(student2);
        for (Student student3 : list) {
            System.out.println(student);
        }

    }
}
