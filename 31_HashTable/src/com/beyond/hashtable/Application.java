package com.beyond.hashtable;

import com.beyond.hashtable.practice.HashTable;

public class Application {
    public static void main(String[] args) {
        HashTable<String,String> hashtable = new HashTable<>();

        //put
        System.out.println("<<put>>");
        hashtable.put("strawberry", "딸기");
        hashtable.put("apple", "사과");
        hashtable.put("grape", "포도");
        hashtable.put("banana", "바나나");
        hashtable.put("banana", "몽키바나나");
        hashtable.put("peach", "복숭아");
        hashtable.put("orange", "오렌지");

        System.out.println(hashtable);
        System.out.println(hashtable.size());
        System.out.println(hashtable.isEmpty());
        System.out.println();

        //get
        System.out.println("<<get>>");
        System.out.println(hashtable.get("banana"));
        System.out.println(hashtable.get("melon"));
        System.out.println();

        //contains
        System.out.println("<<contains>>");
        System.out.println(hashtable.contains("banana"));
        System.out.println(hashtable.contains("strawberry"));
        System.out.println(hashtable.contains("melon"));
        System.out.println();

        //remove
        System.out.println("<<remove>>");
        System.out.println(hashtable.remove("banana"));
        System.out.println(hashtable.remove("strawberry"));
        System.out.println(hashtable.remove("melon"));
        System.out.println();

        System.out.println(hashtable);
        System.out.println(hashtable.size());
        System.out.println(hashtable.isEmpty());
        System.out.println();
    }
}
