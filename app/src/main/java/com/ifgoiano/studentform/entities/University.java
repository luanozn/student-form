package com.ifgoiano.studentform.entities;

import java.util.List;

public class University {

    private final String name;
    private final String state;
    private final List<Course> courses;

    public University(String name, String state, List<Course> courses) {
        this.name = name;
        this.state = state;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
