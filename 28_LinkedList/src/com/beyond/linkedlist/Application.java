package com.beyond.linkedlist;


import com.beyond.linkedlist.practice.List;
import com.beyond.linkedlist.practice.SinglyLinkedList;

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

    }
}
