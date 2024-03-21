package com.situ.foundation3.UtilDemo;

public class ArraysUtil {
    private ArraysUtil() {

    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
