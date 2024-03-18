package com.situ.foundation;

import org.junit.Test;

import java.util.Arrays;

public class Day4 {
    int[] array = new int[4];

    @Test
    public void test() {
        String str = "ABaA";
        String newStr = str.replace('A', 'B');
        System.out.println(newStr);

    }

    //冒泡
    @Test
    public void test1() {
        int[] array = {40, 17, 21, 1};
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
