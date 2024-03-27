package com.situ.foundation4.jdbc;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;

    public Student() {
    }

    public Student(Integer id, String name, Integer age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
