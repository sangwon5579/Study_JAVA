package com.beyond.inherit.practice;

public class Student extends Employee {
    private int grade;
    private String major;

    public Student(){}

    public Student(String name, int age, double height, double weight, int grade, String major){
        super();
        super.name = name;
        setAge(age);
        setHeight(height);
        setWeight(weight);
        this.grade = grade;
        this.major = major;
    }

    @Override
    public String information(){
        return super.information() +
                "Student{" +
                "grade=" + grade +
                ", major='" + major + '\'' +
                '}';
    }


    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
