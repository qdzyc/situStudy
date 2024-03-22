package com.situ.foundation3.iteratorDemo;

import lombok.Data;

@Data
public class Student {
    protected int id;
    protected String name;
    protected int age;
    protected String gender;

    public Student() {
    }

    public Student(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
