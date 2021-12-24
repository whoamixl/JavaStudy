package com.whoami.dao;

public class Teacher {
    private String teacher;

    public Teacher() {
        System.out.println("I am a Teacher!");
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacher='" + teacher + '\'' +
                '}';
    }
}
