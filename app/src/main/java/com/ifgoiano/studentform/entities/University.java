package com.ifgoiano.studentform.entities;

import java.util.List;

public class University {

    private final String name;
    private final int logo;
    private final String state;
    private final List<Course> courses;

    public University(String name, String state, List<Course> courses, int logo) {
        this.name = name;
        this.state = state;
        this.courses = courses;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getState() {
        return state;
    }

    public int getLogo() {
        return logo;
    }
}
