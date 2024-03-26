package com.situ.foundation4.exception;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {
    @Test
    public void test1() {
        try{
            FileReader fileReader = new FileReader("E:\\思途\\io.txt");
            int ch1 = fileReader.read();
            System.out.println((char)ch1);
            int ch2 = fileReader.read();
            System.out.println((char)ch2);
            int ch3 = fileReader.read();
            System.out.println((char)ch3);
            int ch4 = fileReader.read();
            System.out.println((char)ch4);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }
    }

    @Test
    public void test2() {
        try {
            show();
        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }
    }

    private void show() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
    }
}
