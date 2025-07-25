package com.beyond.lambda.practice;

import lombok.*;

@Data
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {
    @NonNull
    private String name;

    @NonNull
    private int age;

    private char gender;

    private int math;

    private int english;

    public int sum(){
        return math + english;
    }

    public double average(){
        return this.sum() / 2.0;
    }

}
