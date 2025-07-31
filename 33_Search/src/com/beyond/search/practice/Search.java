package com.beyond.search.practice;

public class Search {
    //배열에서 특정 숫자의 인덱스를 찾는 메소드
    public static int linearSearch(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch(String str, char ch){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                return i;
            }
        }
        return -1;
    }


    public static int minValue(int[] numbers) {
        int answer = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] <= answer){
                answer = numbers[i];
            }
        }
        return answer;
    }

    public static int binarySearch(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;

            if(numbers[mid] == target){
                return mid;
            }
            else if(numbers[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] numbers, int left, int right, int target) {
        if(left <= right){
            int mid = (left + right) / 2;
            if(numbers[mid] == target){
                return mid;
            }
            else if(numbers[mid] < target){
                return binarySearch(numbers, mid+1, right, target);
            }
            else{
                return binarySearch(numbers, left, mid-1, target);
            }
        }
        return -1;
    }
}

