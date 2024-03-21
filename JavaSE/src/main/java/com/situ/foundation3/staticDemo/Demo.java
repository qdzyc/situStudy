package com.situ.foundation3.staticDemo;

import org.junit.Test;

import java.sql.Array;
import java.util.Arrays;

public class Demo {
    @Test
    public void test() {
        Student student = new Student();
        student.show();
        student.id = 1;
    }

    @Test
    public void test1() {
        int[] array = {1, 5, 24, 21};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
