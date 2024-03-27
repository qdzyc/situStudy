package com.situ.foundation4.io;

import org.junit.Test;

import java.io.*;

public class IODemo {
    @Test
    public void test() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("E:\\思途\\code\\IO.txt");
            int ch1 = fileReader.read();
            System.out.println((char) ch1);
            int ch2 = fileReader.read();
            System.out.println((char) ch2);
            int ch3 = fileReader.read();
            System.out.println((char) ch3);
            int ch4 = fileReader.read();
            System.out.println((char) ch4);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {//非空判断
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void test1() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("E:\\思途\\code\\IO.txt");
            int ch = -1;
            while ((ch = fileReader.read()) != -1) {//循环读
                System.out.println((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {//非空判断
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test2() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("E:\\思途\\code\\IO.txt");
            char[] buffer = new char[10];
            int length = -1;
            while ((length = fileReader.read(buffer)) != -1) {
                System.out.println(length);
                System.out.println(buffer);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null) {//非空判断
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test3() {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader("E:\\思途\\code\\IO.txt");
            fileWriter = new FileWriter("E:\\思途\\code\\IO_back.txt");
            char[] buffer = new char[10];
            int length = -1;
            while ((length = fileReader.read(buffer)) != -1) {
                System.out.println(length);
                System.out.println(buffer);
                //写,读多少写多少
                fileWriter.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //先关写再关读，栈操作
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileReader != null) {//非空判断
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test4() {
        //字节流
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("bd.png");
            fileOutputStream = new FileOutputStream("bd_back.png");
            byte[] buffer = new byte[1024];
            int length = -1;
            while ((length = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test5() {
        Student student = new Student();
        student.setId(1);
        student.setName("张三");
        student.setAge(23);
        student.setGender("男");

        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //序列化
            //写文件
            fileOutputStream = new FileOutputStream("stu");
            //文件转换
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void test6() {
        ObjectInputStream objectInputStream = null;
        FileInputStream fileInputStream = null;
        try {
            //反序列化
            //读文件
            fileInputStream = new FileInputStream("stu");
            //文件转换
            objectInputStream = new ObjectInputStream(fileInputStream);
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
