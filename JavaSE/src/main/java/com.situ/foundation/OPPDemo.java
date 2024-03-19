package com.situ.foundation;

import org.junit.Test;

public class OPPDemo{
    @Test
    public void test() {
        Student[] students = new Student[5];
        //students.for
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
