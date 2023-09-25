package com.example.HW7.models;

public class Employ {
    private String name;
    private String grade;
    private int age;

    public Employ(String name, String grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    public Employ() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", age=" + age +
                '}';
    }
}
