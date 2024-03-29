package com.situ.foundation3.iteratorDemo;

import com.situ.foundation2.Student;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class StudentManager {
    //改为ArrayList<>
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生数量：");
        int count = scanner.nextInt();
        ArrayList<Student> students = new ArrayList<>();
        int i = 0;
        while ((count--) > 0) {
            System.out.println("请输入学生ID：");
            int id = scanner.nextInt();
            System.out.println("请输入学生姓名：");
            String name = scanner.next();
            System.out.println("请输入学生年龄：");
            int age = scanner.nextInt();
            System.out.println("请输入学生性别：");
            String gender = scanner.next();
            Student student = new Student(id, name, age, gender);
            students.add(student);
        }
        while (true) {
            System.out.println("按照ID搜索请输入1：");
            System.out.println("按照姓名搜索请输入2：");
            System.out.println("按照年龄搜索请输入3：");
            System.out.println("按照性别搜索请输入4：");
            System.out.println("退出搜索请输入0");
            int search = scanner.nextInt();
            //卫操作
            if (search == 0) {
                return;
            }
            boolean isFind = false;
            switch (search) {
                case 1:
                    System.out.println("请输入要搜索的ID：");
                    int id = scanner.nextInt();
                    for (Student student : students) {
                        if (id == student.getId()) {
                            System.out.println(student);
                            isFind = true;
                        }
                    }
                    break;
                case 2:
                    System.out.println("请输入要搜索的姓名：");
                    String name = scanner.next();
                    for (Student student : students) {
                        if (Objects.equals(name, student.getName())) {
                            System.out.println(student);
                            isFind = true;
                        }
                    }
                case 3:
                    System.out.println("请输入要搜索的年龄：");
                    int age = scanner.nextInt();
                    for (Student student : students) {
                        if (age == student.getAge()) {
                            System.out.println(student);
                            isFind = true;
                        }
                    }
                case 4:
                    System.out.println("请输入要搜索的性别：");
                    String gender = scanner.next();
                    for (Student student : students) {
                        if (Objects.equals(gender, student.getGender())) {
                            System.out.println(student);
                            isFind = true;
                        }
                    }
                    break;
                default:
                    System.out.println("输入不合法，请重新输入");
            }
            if (!isFind) {
                System.out.println("您所搜索学生不存在");
                System.out.println("---------------");
            }

        }
    }
}
