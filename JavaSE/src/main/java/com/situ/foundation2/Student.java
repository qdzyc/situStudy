package com.situ.foundation2;

import lombok.Data;

@Data
public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;

    public Student() {
    }

    public Student(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
