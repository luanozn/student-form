package com.ifgoiano.studentform.entities;

import com.ifgoiano.studentform.entities.enums.Shift;

import java.util.List;

public class Course {

    private final String name;
    private final Integer workload;
    private final List<Shift> workshift;

    public Course(String name, Integer workload, List<Shift> workshift) {
        this.name = name;
        this.workload = workload;
        this.workshift = workshift;
    }

    public String getName() {
        return name;
    }

    public Integer getWorkload() {
        return workload;
    }

    public List<Shift> getWorkshift() {
        return workshift;
    }
}
