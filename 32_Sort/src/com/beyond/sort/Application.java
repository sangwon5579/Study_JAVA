package com.beyond.sort;

import com.beyond.sort.practice.ArraySort;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        // 삽입 정렬
        int[] numbers = {3, 1, 5, 4, 9, 2};
        System.out.println(Arrays.toString(numbers));
        ArraySort.insertionSort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println();

        //버블 정렬
        numbers = new int[]{3, 1, 5, 4, 9, 2};
        System.out.println(Arrays.toString(numbers));
        ArraySort.bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println();

        //병합 정렬
        numbers = new int[]{3, 1, 5, 4, 9, 2};
        System.out.println(Arrays.toString(numbers));
        ArraySort.mergeSort(numbers, 0, numbers.length-1);
        System.out.println(Arrays.toString(numbers));
        System.out.println();
    }
}
