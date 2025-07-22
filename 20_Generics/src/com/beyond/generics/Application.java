package com.beyond.generics;

import com.beyond.generics.practice.ArrayToListConverter;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        String[] names = {"홍길동", "성춘향", "이몽룡", "김철수", "김영희"};
        Integer[] numbers = {1, 2, 3, 4, 5};
        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};

//        ArrayToListConverter converter = new ArrayToListConverter(names);
//        ArrayToListConverter converter = new ArrayToListConverter(numbers);
//        ArrayToListConverter converter = new ArrayToListConverter(doubles);
//        ArrayToListConverter<String> converter = new ArrayToListConverter<String>(names);
//        ArrayToListConverter<Integer> converter = new ArrayToListConverter<>(numbers);
        ArrayToListConverter<Double> converter = new ArrayToListConverter<>(doubles);
        converter.print();
        System.out.println();


        System.out.println(converter.toList());
//        converter.toList().forEach(System.out::println);
        System.out.println();

    }
}
