package com.ifgoiano.studentform.entities;

import com.ifgoiano.studentform.entities.enums.Shift;

public class Student {

    private final String name;
    private final String cpf;
    private final String rg;
    private final String phone;
    private final String address;
    private final University university;
    private final Course course;
    private final Shift shift;

    public Student(String name, String cpf, String rg, String phone, String address, University university, Course course, Shift shift) {
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.phone = phone;
        this.address = address;
        this.university = university;
        this.course = course;
        this.shift = shift;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public University getUniversity() {
        return university;
    }

    public Course getCourse() {
        return course;
    }

    public Shift getShift() {
        return shift;
    }
}
