package com.beyond.streamapi.practice;

import lombok.*;

@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Comparable<Student>  {
    private String name;
    private int age;
    private char gender;
    private int math;
    private int english;

    public double average(){
        return (this.math + this.english) / 2.0;
    }

    @Override
    public int compareTo(Student student) {
        return this.age - student.age;
    }
}
