package com.beyond.linkedlist;


import com.beyond.linkedlist.practice.List;
import com.beyond.linkedlist.practice.SinglyLinkedList;

import java.sql.SQLOutput;

public class Application {
    public static void main(String[] args) {
        //java에서 제공하는 linkedlist 테스트
//        LinkedList<String> list = new LinkedList<>();
//
//        //add
//        list.addFirst("사과");
//        list.addFirst("딸기");
//        list.addLast("마지막");
//        list.add("add");
//        list.add(1,"1번에추가");
//
//        System.out.println(list);
//
//        //get, contains, size
//        System.out.println(list.get(1));
//        System.out.println(list.contains("사과"));
//        System.out.println(list.contains("1번"));
//        System.out.println(list.size());
//
//        list.removeFirst();
//        System.out.println(list);
//        list.removeLast();
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);
//        list.remove("1번에추가");
//        System.out.println(list);

        //SinglyLinkedList 구현 및 테스트
        List<String> list = new SinglyLinkedList<>();

        //addFirst, addLast, add 구현
        list.addFirst("사과");
        list.addFirst("딸기");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        list.addLast("포도");
        list.addLast("키위");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        list.add(1,"수박");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        list.add(0, "수박");
        list.add(5, "바나나");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        list.add(4, "복숭아");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        //get, contains
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(3));
        System.out.println(list.get(5));
        System.out.println();

        System.out.println(list.contains("딸기"));
        System.out.println(list.contains("두리안"));
        System.out.println(list.contains("참외"));
        System.out.println(list.contains("복숭아"));
        System.out.println();

        //removeFirst, removeLast, remove
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        System.out.println(list);
        list.remove("포도");
        list.remove("바나나");
        list.remove("복숭아");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

    }
}
