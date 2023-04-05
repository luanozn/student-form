package com.ifgoiano.studentform.entities;

import java.util.List;

public class University {

    private String name;
    private List<Course> courses;

    public University(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }
}
